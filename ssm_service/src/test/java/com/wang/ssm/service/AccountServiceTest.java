package com.wang.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.pojo.Account;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author WangQingLong
 * @version v1.0
 * @date 2019/11/12 13:02
 * @description TODO
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/application*.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAll() {
        List<Account> all = accountService.findAll();
        System.out.println("all = " + all);
    }
}