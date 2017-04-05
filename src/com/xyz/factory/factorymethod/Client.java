package com.xyz.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        ExportFactory factory = new ExportHtmlFactory();
        ExportFile file = factory.factory(ExportType.STANDARD);
        file.export();
    }
}
