package com.bobo.jhb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bobo.jhb.vo.PageVO;

/**
 * <p>
 * 系统管理-用户基础信息表 服务类
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
public interface SysUserService extends IService<SysUser> {

    PageVO pageUser(SearchDTO searchDTO);
}
