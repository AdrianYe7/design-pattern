package com.xyz.factory.factorymethod;

public class ExportPdfFactory implements ExportFactory {

    @Override
    public ExportFile factory(int type) {
        if(type == ExportType.STANDARD) {
            return new ExportStandardPdfFile();
        } else if(type == ExportType.FINANCIAL) {
            return new ExportFinancialPdfFile();
        } else {
            throw new IllegalArgumentException("错误的导出类型");
        }
    }

}
