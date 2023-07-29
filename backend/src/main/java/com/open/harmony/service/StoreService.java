package com.open.harmony.service;


import com.open.harmony.common.Result;
import com.open.harmony.entity.Store;
import com.open.harmony.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

public interface StoreService {

    /**
     * 店家登录
     * @param storeId
     * @param password
     * @return
     */
    Result Login(BigInteger storeId, String password);

}
