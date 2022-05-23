package com.bobo.jhb.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bobo.jhb.commom.R;
import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.entity.SysUser;
import com.bobo.jhb.service.SysUserService;
import com.bobo.jhb.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 系统管理-用户基础信息表 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 人员分页查询
     */
    @PostMapping("/pageUser")
    public R pageListTeacher(@RequestBody  SearchDTO searchDTO) {
        PageVO pageVO = sysUserService.pageUser(searchDTO);
        System.out.println("调用成功");
        return R.success(pageVO);
    }

}

