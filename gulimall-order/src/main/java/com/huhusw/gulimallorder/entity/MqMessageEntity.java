package com.huhusw.gulimallorder.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:47:16
 */
@Data
@TableName("mq_message")
public class MqMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String messageId;
	/**
	 * $column.comments
	 */
	private String content;
	/**
	 * $column.comments
	 */
	private String toExchange;
	/**
	 * $column.comments
	 */
	private String classType;
	/**
	 * $column.comments
	 */
	private Integer messageStatus;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private Date updateTime;

}
