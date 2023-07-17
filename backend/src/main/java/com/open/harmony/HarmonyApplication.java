package com.open.harmony;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author jzx
 */

@SpringBootApplication
//@MapperScan("com.open.harmony.mapper")
public class HarmonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HarmonyApplication.class, args);
    }

}
