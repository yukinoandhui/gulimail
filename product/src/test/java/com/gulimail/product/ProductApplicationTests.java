package com.gulimail.product;

import com.gulimail.product.entity.BrandEntity;
import com.gulimail.product.service.BrandService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)


public class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
 public     void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
