package com.xyz.factory.factorymethod;

public class ExportStandardHtmlFile implements ExportFile {

    @Override
    public void export() {
        System.out.println("正在使用标准html格式导出html文件");
    }

}
