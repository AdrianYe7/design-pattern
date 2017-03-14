package com.xyz.facade;

import com.xyz.facade.module.Facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.test();
	}
}
