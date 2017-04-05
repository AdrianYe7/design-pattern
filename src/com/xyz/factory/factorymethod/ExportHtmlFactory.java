package com.xyz.factory.factorymethod;

public class ExportHtmlFactory implements ExportFactory {

    @Override
    public ExportFile factory(int type) {
        if(type == ExportType.STANDARD) {
            return new ExportStandardHtmlFile();
        } else if(type == ExportType.FINANCIAL) {
            return new ExportStandardPdfFile();
        } else {
            throw new IllegalArgumentException("错误的导出类型");
        }
    }

}
