/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 系统配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@ApiModel(value = "系统配置信息")
@Data
@TableName("sys_config")
public class SysConfigEntity {

	/**
	 * 配置id
	 */
	@ApiModelProperty("配置id")
	@TableId
	private Long id;
	/**
	 * 参数名
	 */
	@ApiModelProperty("参数名")
	@NotBlank(message="参数名不能为空")
	private String paramKey;
	/**
	 * 参数值
	 */
	@ApiModelProperty("参数值")
	@NotBlank(message="参数值不能为空")
	private String paramValue;
	/**
	 * 备注
	 */
	@ApiModelProperty("备注")
	private String remark;

}
