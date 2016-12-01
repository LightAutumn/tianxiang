package com.yin.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yinyuxia on 2016/11/25.
 */
public class TestController extends HttpServlet {
    public static void mian(String[] args){
        HttpServletRequest request=null;
        Cookie[] cookies= request.getCookies();
        for(Cookie c:cookies){

        }
    }

}
