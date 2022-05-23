<template>
  <div>
    <el-table
      :data="list"
    >
      <el-table-column
        prop="username"
        label="姓名">
      </el-table-column>
      <el-table-column
        prop="phone"
        label="手机号">
      </el-table-column>
      <el-table-column
        prop="email"
        label="邮箱">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import axios from 'axios'

export default {

  data() {
    return {
      list: []
    }
  },
  watch: {
  },
  mounted() {
    this.getTableData()
  },
  methods: {
    getTableData() {
      axios({
        url: 'http://localhost:9001/core' + '/user/pageUser',
        method: 'post',
        headers: {
          'Content-Type': 'application/json'
        },
        data: {
          current: 1,
          size: 10,
          searchKey: '蒋海波'
        }
      }).then((data) => {
        console.log(data)
        this.list = data.data.data.list
      })
    }
  }
}
</script>
