package com.itlike.struts2;

/**
 * @author Administrator
 */
public class HelloAction {
    public String execute(){
        System.out.println("我已经接收到了请求");
        return "success";
    }
}
