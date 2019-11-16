package com.wang.ssm.service.impl;


import com.wang.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.AccountMapper;
import ssm.pojo.Account;

import java.util.List;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/12 8:23
 * @description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 查询所有数据
     *
     * @return
     */
    public List<Account> findAll() {

        List<Account> accounts = accountMapper.findAll();
        return accounts;
    }

    /**
     * 保存用户数据
     *
     * @param account
     */
    public void SaveCount(Account account) {
        accountMapper.SaveCount(account);
    }
}
