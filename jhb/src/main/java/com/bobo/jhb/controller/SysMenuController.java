package com.bobo.jhb.controller;


import com.bobo.jhb.commom.R;
import com.bobo.jhb.dto.SearchDTO;
import com.bobo.jhb.service.SysMenuService;
import com.bobo.jhb.service.SysUserService;
import com.bobo.jhb.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统管理-权限资源表  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 人员分页查询
     */
    @PostMapping("/pageMenu")
    public R pageListTeacher(@RequestBody SearchDTO searchDTO) {
        PageVO pageVO = sysMenuService.pageUser(searchDTO);
        return R.success(pageVO);
    }
}

