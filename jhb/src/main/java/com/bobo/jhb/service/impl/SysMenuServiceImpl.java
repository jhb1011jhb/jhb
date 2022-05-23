package com.bobo.jhb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.entity.SysMenu;
import com.bobo.jhb.entity.SysUser;
import com.bobo.jhb.mapper.SysMenuMapper;
import com.bobo.jhb.service.SysMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bobo.jhb.utils.BeanConvertUtils;
import com.bobo.jhb.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统管理-权限资源表  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public PageVO pageUser(SearchDTO searchDTO) {
        LambdaQueryWrapper<SysMenu> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<SysMenu> userPage = new Page<>(searchDTO.getCurrent() , searchDTO.getSize());
        IPage<SysMenu> userIPage = sysMenuMapper.selectPage(userPage , userLambdaQueryWrapper);

        PageVO PageVO = BeanConvertUtils.convert(userIPage, PageVO.class);
        PageVO.setList(userIPage.getRecords());
        PageVO.setTotalCount(userIPage.getTotal());
        return PageVO;
    }
}
