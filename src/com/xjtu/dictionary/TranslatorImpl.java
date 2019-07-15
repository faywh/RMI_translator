package com.xjtu.dictionary;
import java.rmi.*;

import java.rmi.server.*;
import java.util.HashMap;
public class TranslatorImpl extends UnicastRemoteObject implements Translator{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *远程对象实现类，实现远程服务对象的本地接口 
	 * @throws RemoteException 
	 */
	HashMap<String,String> words = new HashMap<String, String>();
	public TranslatorImpl() throws RemoteException{
		super();
		words.put("China", "n. 中国");
		words.put("German", "n. 日本");
		words.put("American", "n. 美国人，adj. 美国的");
		words.put("water", "n. 水");
	}
	public String translate(String str) throws RemoteException {
		// TODO Auto-generated method stub
		if(words.containsKey(str)){
			return words.get(str);
		}else{
			return null;
		}
	}
}
