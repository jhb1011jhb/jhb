import axios from 'axios'
import { Message } from 'element-ui'
import store from '@/store'
import { getToken } from '@/utils/auth'

/**
 * 统一进行异常输出
 * 如果异常只是弹框显示即可，可使用该实例
 */
const httpCustom = axios.create({
  timeout: 1000 * 1800,
  withCredentials: true,
  headers: {
    'Content-Type': 'application/json; charset=utf-8'
  }
})
/**
 *对于出现异常时还需要做其他操作，可使用该实例
 */
const http = axios.create({
  timeout: 1000 * 1800,
  withCredentials: true,
  headers: {
    'Content-Type': 'application/json; charset=utf-8'
  }
})

/**
 * 封装的异常对象
 * @param message
 * @param code
 * @constructor
 */
function EipException(message, code) {
  this.msg = message
  this.code = code
}

/**
 * 请求拦截
 */
http.interceptors.request.use(config => {
  config.headers['token'] = getToken() // 请求头带上token
  return config
}, error => {
  return Promise.reject(error)
})

/**
 * 自定义请求拦截
 */
httpCustom.interceptors.request.use(config => {
  config.headers['token'] = getToken() // 请求头带上token
  config.params = {
    _t: Date.parse(new Date()) / 1000,
    ...config.params
  }
  return config
}, error => {
  return Promise.reject(error)
})

/**
 * get请求
 * @param url
 * @param params
 * @returns {Promise<any>}
 */
export function get(url, params = {}, customHandlerException = false) {
  if (!url.startsWith('http')) {
    url = window.SITE_CONFIG.cmdbUrl + url
  }
  if (customHandlerException) {
    return new Promise((resolve, reject) => {
      httpCustom.get(url, {
        params: params
      }).then(response => {
        resolve(response)
      }).catch(err => {
        reject(err)
      })
    })
  }
  return new Promise((resolve, reject) => {
    http.get(url, {
      params: params
    }).then(response => {
      resolve(response.data)
    }).catch(err => {
      reject(err)
    })
  })
}

/**
 * post 请求
 * @param url
 * @param params
 * @returns {Promise<any>}
 */
export function post(url, data = {}, customHandlerException = false) {
  if (!url.startsWith('http')) {
    url = window.SITE_CONFIG.cmdbUrl + url
  }
  data = JSON.stringify(data)
  if (customHandlerException) {
    return new Promise((resolve, reject) => {
      httpCustom.post(url, data).then(response => {
        resolve(response)
      }).catch(err => {
        reject(err)
      })
    })
  }
  return new Promise((resolve, reject) => {
    http.post(url, data).then(response => {
      resolve(response.data)
    }).catch(err => {
      reject(err)
    })
  })
}

/**
 * delete 请求
 * @param url
 * @param data
 * @returns {Promise<any>}
 */
export function del(url, data = {}, customHandlerException = false) {
  if (!url.startsWith('http')) {
    url = window.SITE_CONFIG.baseUrl + url
  }
  data = JSON.stringify(data)
  if (customHandlerException) {
    return new Promise((resolve, reject) => {
      httpCustom.delete(url, data).then(response => {
        resolve(response)
      }).catch(err => {
        reject(err)
      })
    })
  }
  return new Promise((resolve, reject) => {
    http.delete(url, data).then(response => {
      resolve(response.data)
    }).catch(err => {
      reject(err)
    })
  })
}

/**
 * put 请求
 * @param url
 * @param data
 * @returns {Promise<any>}
 */
export function put(url, data = {}, customHandlerException = false) {
  if (!url.startsWith('http')) {
    url = window.SITE_CONFIG.baseUrl + url
  }
  data = JSON.stringify(data)
  if (customHandlerException) {
    return new Promise((resolve, reject) => {
      httpCustom.put(url, data).then(response => {
        resolve(response)
      }).catch(err => {
        reject(err)
      })
    })
  }
  return new Promise((resolve, reject) => {
    http.put(url, data).then(response => {
      resolve(response.data)
    }).catch(err => {
      reject(err)
    })
  })
}

/**
 * 包装uri地址
 * @param url
 * @returns {*}
 */
export function cmdbWrapUrl(url) {
  if (!url.startsWith('http')) {
    url = window.SITE_CONFIG.baseUrl + url
  }
  return url
}

/**
 * 响应拦截
 */
http.interceptors.response.use(response => {
  const res = response.data
  // 异常拦截
  if (res && res.code === 401) {
    if (window.SITE_CONFIG.casEnable) {
      console.log('axios.js 401')
      window.location.href = window.SITE_CONFIG.casUrl + '/login?service=' + window.SITE_CONFIG.baseUrl + '/cas/login'
    } else {
      // 重新登录
      store.dispatch('user/resetToken').then(() => {
        location.reload()
      })
    }
  } else if (res && res.code !== 200) {
    // 错误信息统一在这里处理、页面代码只需要关系正常情况即可
    Message({
      message: response.data.msg || 'error',
      type: 'error',
      duration: 5 * 1000
    })
    // return Promise.reject(response.data.msg)
    throw new EipException(response.data.msg, response.data.code)
  } else {
    return res
  }
}, error => {
  if (error.message && error.message === 'Network Error') {
    Message({
      message: '服务无法访问',
      type: 'error',
      duration: 5 * 1000
    })
    return Promise.reject(error)
  }
  return Promise.reject(error)
})

/**
 * 响应拦截
 */
httpCustom.interceptors.response.use(response => {
  const res = response.data
  // 异常拦截
  if (res && res.code !== 200) {
    throw new EipException(response.data.msg, response.data.code)
  } else {
    return res
  }
}, error => {
  if (error.message && error.message === 'Network Error') {
    Message({
      message: '服务无法访问',
      type: 'error',
      duration: 5 * 1000
    })
    return Promise.reject(error)
  }
  return Promise.reject(error)
})
