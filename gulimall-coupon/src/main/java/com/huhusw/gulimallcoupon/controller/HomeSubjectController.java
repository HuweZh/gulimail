package com.huhusw.gulimallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huhusw.gulimallcoupon.entity.HomeSubjectEntity;
import com.huhusw.gulimallcoupon.service.HomeSubjectService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.R;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:14
 */
@RestController
@RequestMapping("gulimallcoupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubject:list")
    public R info(@PathVariable("id") Long id){
		HomeSubjectEntity homeSubject = homeSubjectService.getById(id);

        return R.ok().put("homeSubject", homeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubject:list")
    public R save(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.save(homeSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubject:list")
    public R update(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.updateById(homeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:homesubject:list")
    public R delete(@RequestBody Long[] ids){
		homeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
