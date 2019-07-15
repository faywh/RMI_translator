package com.xjtu.dictionary;

import java.rmi.*;

public class TranslatorServer {
	/**
	 * RMI服务器类，创建远程对象实现类TranslatorImpl的一个实例，然后通过一个专有的url来注册（使用java.rmi.Naming.rebind()方法）。
	 */
	public static void main(String[] args) {
		//服务器端设置安全机制
		/*
		if(System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		*/
		try{
			System.out.println("TranslatorServer start ...");
			TranslatorImpl tImpl = new TranslatorImpl();
			Naming.rebind("//127.0.0.1/TranslatorService", tImpl);
			System.out.println("Ready to do translator ...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
