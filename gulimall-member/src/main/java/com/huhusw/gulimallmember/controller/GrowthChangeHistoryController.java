package com.huhusw.gulimallmember.controller;

import java.util.Arrays;
import java.util.Map;

import com.huhusw.gulimallmember.entity.MemberEntity;
import com.huhusw.gulimallmember.feign.CouponTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huhusw.gulimallmember.entity.GrowthChangeHistoryEntity;
import com.huhusw.gulimallmember.service.GrowthChangeHistoryService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.R;



/**
 * 成长值变化历史记录
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:32:49
 */
@RestController
@RequestMapping("gulimallmember/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Autowired
    public CouponTestService couponTestService;
    /**
     * 测试远程调用
     */
    @RequestMapping("/test")
    public R test(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R coupon = couponTestService.getCoupon();
        System.out.println("member test------------ ");
        return R.ok().put("member", memberEntity).put("coupons", coupon.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallmember:growthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallmember:growthchangehistory:list")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallmember:growthchangehistory:list")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallmember:growthchangehistory:list")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
		growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // 这里使用的是springsecurity而不是shiro,所以这个注解展示用不到
    //@RequiresPermissions("gulimallmember:growthchangehistory:list")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
