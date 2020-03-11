package com.itlike.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 */
public class HelloAction3 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("hello3");
        return SUCCESS;
    }
}
