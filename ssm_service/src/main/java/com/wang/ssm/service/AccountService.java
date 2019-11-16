package com.wang.ssm.service;



import ssm.pojo.Account;

import java.util.List;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/12 8:23
 * @description:
 */
public interface AccountService {


    /**
     * 查询所有
     *
     * @return
     */
    List<Account> findAll();


    /**保存用户数据
     * @param account
     */
    void SaveCount(Account account);
}
