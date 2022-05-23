package com.bobo.jhb.service;

import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bobo.jhb.vo.PageVO;

/**
 * <p>
 * 系统管理-权限资源表  服务类
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
public interface SysMenuService extends IService<SysMenu> {

    PageVO pageUser(SearchDTO searchDTO);
}
