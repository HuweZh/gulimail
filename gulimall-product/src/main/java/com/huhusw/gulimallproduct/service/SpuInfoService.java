package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-22 22:02:16
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

