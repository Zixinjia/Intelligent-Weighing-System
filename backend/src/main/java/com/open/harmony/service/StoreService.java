package com.open.harmony.service;


import com.open.harmony.common.Result;

import java.math.BigInteger;

public interface StoreService {

    /**
     * 店家登录
     *
     * @param storeId
     * @param password
     * @return
     */
    Result Login(BigInteger storeId, String password);

}
