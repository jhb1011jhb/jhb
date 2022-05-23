package com.bobo.jhb.mapper;

import com.bobo.jhb.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 系统管理-用户基础信息表 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@Component
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
