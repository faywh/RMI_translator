package com.xjtu.dictionary;

import java.rmi.*;

public class TranslatorServer {
	/**
	 * RMI�������࣬����Զ�̶���ʵ����TranslatorImpl��һ��ʵ����Ȼ��ͨ��һ��ר�е�url��ע�ᣨʹ��java.rmi.Naming.rebind()��������
	 */
	public static void main(String[] args) {
		//�����������ð�ȫ����
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
