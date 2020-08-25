package com.huhusw.gulimallmember.feign;

import com.huhusw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//告诉feign调用gulimall-coupon服务
@FeignClient("gulimall-coupon")
public interface CouponTestService {

    //粘贴需要调用的接口,访问路径需要写全
    @RequestMapping("/gulimallcoupon/coupon/getall")
    public R getCoupon();

}
