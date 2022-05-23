package com.bobo.jhb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.entity.SysUser;
import com.bobo.jhb.mapper.SysUserMapper;
import com.bobo.jhb.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bobo.jhb.utils.BeanConvertUtils;
import com.bobo.jhb.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统管理-用户基础信息表 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public PageVO pageUser(SearchDTO searchDTO) {

        LambdaQueryWrapper<SysUser> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.like(SysUser::getUsername , searchDTO.getSearchKey());
        Page<SysUser> userPage = new Page<>(searchDTO.getCurrent() , searchDTO.getSize());
        IPage<SysUser> userIPage = sysUserMapper.selectPage(userPage , userLambdaQueryWrapper);

        PageVO PageVO = BeanConvertUtils.convert(userIPage, PageVO.class);
        PageVO.setList(userIPage.getRecords());
        PageVO.setTotalCount(userIPage.getTotal());
        return PageVO;
    }
}
