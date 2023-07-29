package com.open.harmony.service.serviceImpl;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Store;
import com.open.harmony.mapper.StoreMapper;
import com.open.harmony.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/29 8:44
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    /**
     * 店家登录
     * @param storeId
     * @param password
     * @return
     */
    @Override
    public Result Login(BigInteger storeId, String password) {
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
