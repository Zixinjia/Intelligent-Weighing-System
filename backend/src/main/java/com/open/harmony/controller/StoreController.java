package com.open.harmony.controller;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Store;
import com.open.harmony.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreMapper storeMapper;

    @RequestMapping("/login")
    @PostMapping
    public Result storeLogin(@RequestBody Store store) {
        BigInteger storeId = store.getStoreId();
        String password = store.getPassword();
        if (storeId.equals(" ") || password.equals(" ")) {
            return Result.error("用户名或者密码为空");
        }
        if (storeMapper.Login(storeId, password) != null) {
            return Result.success(storeMapper.Login(storeId,password));
        } else {
            return Result.error("用户名或密码错误");
        }
    }
}
