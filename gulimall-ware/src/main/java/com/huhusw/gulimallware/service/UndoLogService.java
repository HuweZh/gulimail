package com.huhusw.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

