package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-22 22:02:17
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

