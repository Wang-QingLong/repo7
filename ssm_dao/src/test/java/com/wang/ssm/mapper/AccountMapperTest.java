package com.wang.ssm.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.mapper.AccountMapper;
import ssm.pojo.Account;

import java.util.Date;
import java.util.List;

/**
 * @author WangQingLong
 * @version v1.0
 * @date 2019/11/12 9:12
 * @description TODO
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:spring/applicationContext-mybatis.xml"})
public class AccountMapperTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void findAll() {
        List<Account> all = accountMapper.findAll();
        System.out.println("all = " + all);
    }

    @Test
    public void saveCount() {
        Account account = new Account();
        account.setName("王五");
        account.setMoney(9999);
        account.setBirthday(new Date());
        accountMapper.SaveCount(account);
    }
}