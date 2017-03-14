package com.xyz.facade.module;

/**
 * 
 * @author ReY
 * Facade是门面类，有了这个类，客户端不需要知道ModuleA,B,C的存在，
 * 直接和该类进行交互，从而实现类客户端和ModuleA,B,C解耦，
 * 客户端更容易使用系统
 * 
 * 另外，子系统一般有很多方法，有的方法是子系统内部交互的，
 * 有的是供外部调用的，而门面类可以屏蔽内部细节，暴露只供外部调用的方法。
 */
public class Facade {
	public void test() {
		ModuleA a = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}
}
