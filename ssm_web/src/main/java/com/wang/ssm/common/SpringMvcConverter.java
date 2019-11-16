package com.wang.ssm.common;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/11/12 10:50
 * @description: 自定义转换器: string to date
 */
public class SpringMvcConverter  implements Converter<String , Date> {


    public Date convert(String s) {

            if (s==null||s.trim().equals("")) {

                throw new RuntimeException("请您传入数据");
            }

            DateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
            try {
                return dateFormat.parse(s);
            } catch (Exception e) {

                throw new RuntimeException("数据有误，请重新输入");
            }

        }

    }

