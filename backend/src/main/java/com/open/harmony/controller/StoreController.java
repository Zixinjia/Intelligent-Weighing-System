package com.open.harmony.controller;
import com.open.harmony.common.Result;
import com.open.harmony.entity.Store;
import com.open.harmony.mapper.StoreMapper;
import com.open.harmony.service.StoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
@Api(tags = "店家模块")
@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    /**
     * 店家登录
     *
     * @param store
     * @return
     */
    @ApiOperation("店家登录")
    @RequestMapping("/login")
    @PostMapping
    public Result storeLogin(@RequestBody Store store) {
        BigInteger storeId = store.getStoreId();
        String password = store.getPassword();
        return storeService.Login(storeId, password);
    }

}
//    @GetMapping("/12345")
//    public String test(){
//        return "Hello,test~";
//    }
