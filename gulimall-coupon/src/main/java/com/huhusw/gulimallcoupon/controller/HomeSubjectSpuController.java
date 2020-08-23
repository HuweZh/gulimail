package com.huhusw.gulimallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huhusw.gulimallcoupon.entity.HomeSubjectSpuEntity;
import com.huhusw.gulimallcoupon.service.HomeSubjectSpuService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.R;



/**
 * 专题商品
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:14
 */
@RestController
@RequestMapping("gulimallcoupon/homesubjectspu")
public class HomeSubjectSpuController {
    @Autowired
    private HomeSubjectSpuService homeSubjectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubjectspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubjectspu:list")
    public R info(@PathVariable("id") Long id){
		HomeSubjectSpuEntity homeSubjectSpu = homeSubjectSpuService.getById(id);

        return R.ok().put("homeSubjectSpu", homeSubjectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubjectspu:list")
    public R save(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuService.save(homeSubjectSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubjectspu:list")
    public R update(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
		homeSubjectSpuService.updateById(homeSubjectSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubjectspu:list")
    public R delete(@RequestBody Long[] ids){
		homeSubjectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
