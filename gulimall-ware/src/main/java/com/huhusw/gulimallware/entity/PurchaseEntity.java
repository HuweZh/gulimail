package com.huhusw.gulimallware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long assigneeId;
	/**
	 * $column.comments
	 */
	private String assigneeName;
	/**
	 * $column.comments
	 */
	private String phone;
	/**
	 * $column.comments
	 */
	private Integer priority;
	/**
	 * $column.comments
	 */
	private Integer status;
	/**
	 * $column.comments
	 */
	private Long wareId;
	/**
	 * $column.comments
	 */
	private BigDecimal amount;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Date updateTime;

}
