package com.huhusw.gulimallproduct;

import com.huhusw.gulimallproduct.entity.BrandEntity;
import com.huhusw.gulimallproduct.entity.CategoryBrandRelationEntity;
import com.huhusw.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimailProductApplicationTests {
    @Autowired
    public BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        boolean save = brandService.save(brandEntity);
        System.out.println("插入成功,返回码: " + save);
    }

}
