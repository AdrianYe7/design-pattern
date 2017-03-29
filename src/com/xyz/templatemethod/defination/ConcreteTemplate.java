package com.xyz.templatemethod.defination;

public class ConcreteTemplate extends AbstractTemplate {

    /**
     * 该方法必须实现
     */
    @Override
    protected void abstractMethod() {
        //业务相关的代码
    }

    /**
     * 该方法可实现可不实现
     */
    @Override
    protected void hookMethod() {
        //业务相关代码
    }

}
