package com.huhusw.gulimallware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huhusw.gulimallware.entity.WareOrderTaskDetailEntity;
import com.huhusw.gulimallware.service.WareOrderTaskDetailService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.R;



/**
 * 库存工作单
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
@RestController
@RequestMapping("gulimallware/wareordertaskdetail")
public class WareOrderTaskDetailController {
    @Autowired
    private WareOrderTaskDetailService wareOrderTaskDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallware:wareordertaskdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareOrderTaskDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallware:wareordertaskdetail:list")
    public R info(@PathVariable("id") Long id){
		WareOrderTaskDetailEntity wareOrderTaskDetail = wareOrderTaskDetailService.getById(id);

        return R.ok().put("wareOrderTaskDetail", wareOrderTaskDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallware:wareordertaskdetail:list")
    public R save(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail){
		wareOrderTaskDetailService.save(wareOrderTaskDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallware:wareordertaskdetail:list")
    public R update(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail){
		wareOrderTaskDetailService.updateById(wareOrderTaskDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallware:wareordertaskdetail:list")
    public R delete(@RequestBody Long[] ids){
		wareOrderTaskDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
