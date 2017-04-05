package com.xyz.factory.factorymethod;

public class ExportStandardPdfFile implements ExportFile {

    @Override
    public void export() {
        System.out.println("正在使用标准格式导出pdf文件");
    }

}
