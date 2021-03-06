package com.huhusw.gulimallorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallorder.dao.UndoLogDao;
import com.huhusw.gulimallorder.entity.UndoLogEntity;
import com.huhusw.gulimallorder.service.UndoLogService;


@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLogEntity> implements UndoLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UndoLogEntity> page = null;
        try {
            page = this.page(
                new Query<UndoLogEntity>().getPage(params),
                new QueryWrapper<UndoLogEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PageUtils(page);
    }

}
