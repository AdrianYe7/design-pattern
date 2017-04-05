package com.xyz.factory.factorymethod;

/**
 * 抽象工厂角色
 * <p>Title: ExportFactory</p>
 * <p>Description: </p>
 * @author Administrator
 *
 */
public interface ExportFactory {
    public ExportFile factory(int type);
}
