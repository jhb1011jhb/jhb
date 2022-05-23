package com.bobo.jhb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统管理-权限资源表 
 * </p>
 *
 * @author testjava
 * @since 2022-05-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysMenu对象", description="系统管理-权限资源表 ")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "上级资源ID")
    private String parentId;

    @ApiModelProperty(value = "url")
    private String url;

    @ApiModelProperty(value = "资源编码")
    private String resources;

    @ApiModelProperty(value = "资源名称")
    private String title;

    @ApiModelProperty(value = "资源级别")
    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer sortNo;

    @ApiModelProperty(value = "资源图标")
    private String icon;

    @ApiModelProperty(value = "类型 menu、button")
    private String type;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updataTime;

    @ApiModelProperty(value = "删除标识")
    private Integer delFlag;


}
