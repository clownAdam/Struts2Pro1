package com.itlike.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 */
public class MethodAction extends ActionSupport {
    public void add(){
        System.out.println("添加");
    }
    public void delete(){
        System.out.println("删除");
    }
    public void update(){
        System.out.println("更新");
    }
    public void find(){
        System.out.println("查询");
    }
}
