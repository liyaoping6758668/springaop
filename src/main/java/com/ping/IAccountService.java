package com.ping;

/**
 * @author:lyp
 * @date 2020/2/2-19:50
 */
public interface IAccountService {
    //保存账户
    void saveAccount();
    //更新账户
    void updateAccount(int i);
    //删除账户
    int deleteAccount();

}
