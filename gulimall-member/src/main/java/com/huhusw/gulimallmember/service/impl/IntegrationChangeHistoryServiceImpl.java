package com.huhusw.gulimallmember.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallmember.dao.IntegrationChangeHistoryDao;
import com.huhusw.gulimallmember.entity.IntegrationChangeHistoryEntity;
import com.huhusw.gulimallmember.service.IntegrationChangeHistoryService;


@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity> implements IntegrationChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationChangeHistoryEntity> page = null;
        try {
            page = this.page(
                new Query<IntegrationChangeHistoryEntity>().getPage(params),
                new QueryWrapper<IntegrationChangeHistoryEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PageUtils(page);
    }

}
