package com.wang.ssm.controller;


import com.wang.ssm.service.AccountService;
import com.wang.ssm.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.pojo.Account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/12 1:33
 * @description:
 */
@Controller
@RequestMapping("/wang")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAllTest")
    public String findAllTest(Model model) {
        System.out.println("asasasasa");
        List<Account> accounts = accountService.findAll();

        System.out.println("accounts = " + accounts);
        model.addAttribute("accounts", accounts);

        return "success";
    }



    @RequestMapping(value = "/insertTest", method = RequestMethod.POST)
    public void insertTest(Account account,  HttpServletRequest request, HttpServletResponse response) throws IOException {
       accountService.SaveCount(account);

        response.sendRedirect(request.getContextPath()+"/wang/findAllTest.do");
    }


}
