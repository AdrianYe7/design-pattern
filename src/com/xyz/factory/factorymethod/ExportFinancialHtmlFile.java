package com.xyz.factory.factorymethod;

public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public void export() {
        System.out.println("正在使用财务需求格式导出html文件");
    }

}
