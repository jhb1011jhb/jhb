package com.bobo.jhb.mapper;

import com.bobo.jhb.entity.SysRoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 系统管理 - 角色-权限资源关联表  Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@Component
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

}
