package com.huhusw.gulimallproduct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 14:35:49
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private String spuName;
	/**
	 * $column.comments
	 */
	private String spuDescription;
	/**
	 * $column.comments
	 */
	private Long catalogId;
	/**
	 * $column.comments
	 */
	private Long brandId;
	/**
	 * $column.comments
	 */
	private BigDecimal weight;
	/**
	 * $column.comments
	 */
	private Integer publishStatus;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Date updateTime;

}
