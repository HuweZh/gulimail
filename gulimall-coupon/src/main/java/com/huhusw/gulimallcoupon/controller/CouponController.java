package com.huhusw.gulimallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huhusw.gulimallcoupon.entity.CouponEntity;
import com.huhusw.gulimallcoupon.service.CouponService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.R;



/**
 * 优惠券信息
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:14
 */
// 动态刷新
@RefreshScope
@RestController
@RequestMapping("gulimallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.username}")
    private String username;

    @Value("${coupon.age}")
    private String age;

    /**
     * 配置中心测试
     */
    @RequestMapping("/getinfo")
    public R getInfo(){
        return R.ok().put("username", username).put("age", age);
    }
    /**
     * 远程调用测试接口
     */
    @RequestMapping("/getall")
    public R getCoupon(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setNote("满10000减5000");
        System.out.println("coupon test------------ ");
        return R.ok().put("coupons",Arrays.asList(couponEntity));
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:coupon:list")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:coupon:list")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:coupon:list")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallcoupon:coupon:list")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
