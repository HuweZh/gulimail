package com.huhusw.gulimallware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存工作单
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private String skuName;
	/**
	 * $column.comments
	 */
	private Integer skuNum;
	/**
	 * $column.comments
	 */
	private Long taskId;
	/**
	 * $column.comments
	 */
	private Long wareId;
	/**
	 * $column.comments
	 */
	private Integer lockStatus;

}
