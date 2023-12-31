/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 部门管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@ApiModel(value = "部门管理")
@Data
@TableName("sys_dept")
public class SysDeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门ID
	 */
	@ApiModelProperty("部门ID")
	@TableId
	private Long deptId;
	/**
	 * 上级部门ID，一级部门为0
	 */
	@ApiModelProperty("上级部门ID，一级部门为0")
	private Long parentId;
	/**
	 * 部门名称
	 */
	@ApiModelProperty("部门名称")
	private String name;
	/**
	 * 上级部门名称
	 */
	@TableField(exist=false)
	private String parentName;
	/**
	 * 排序
	 */
	@ApiModelProperty("排序")
	private Integer orderNum;
	/**
	 * 是否删除
	 */
	@ApiModelProperty("是否删除")
	@TableLogic
	private Integer delFlag;
	/**
	 * ztree属性
	 */
	@TableField(exist=false)
	private Boolean open;
	@TableField(exist=false)
	private List<?> list;
}
