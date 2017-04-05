package com.xyz.factory.factorymethod;

public class ExportFinancialPdfFile implements ExportFile {

    @Override
    public void export() {
        System.out.println("正在使用财务需求格式导出pdf文件");
    }

}
