package com.ping.impl;

import com.ping.IAccountService;

/**
 * @author:lyp
 * @date 2020/2/2-19:52
 */
public class IAccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存账户信息");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("更新账户信息");
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除账户信息");
        return 0;
    }
}
