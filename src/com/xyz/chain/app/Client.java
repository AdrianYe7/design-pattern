package com.xyz.chain.app;

public class Client {
    public static void main(String[] args) {
        Handler pm = new ProjectManager();
        Handler dm = new DeptManager();
        Handler gm = new GeneralManager();
        pm.setHandler(dm);
        dm.setHandler(gm);
        
        pm.handleRequest("zhangsan", 500);
        pm.handleRequest("zhangsan", 1000);
        pm.handleRequest("zhangsan", 2000);
    }
}
