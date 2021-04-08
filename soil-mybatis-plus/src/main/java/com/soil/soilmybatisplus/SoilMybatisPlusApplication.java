package com.soil.soilmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author soil
 * @date 2021/4/6
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.soil.soilmybatisplus.user.mapper",
})
public class SoilMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoilMybatisPlusApplication.class, args);
    }

}
