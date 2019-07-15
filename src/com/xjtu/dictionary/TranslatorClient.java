package com.xjtu.dictionary;

import java.rmi.*;

public class TranslatorClient {
	public static void main(String[] args){
		try{
			Translator tran = (Translator) Naming.lookup("//127.0.0.1/TranslatorService");
			System.out.println("·­Òë½á¹û£º" + tran.translate("China"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
