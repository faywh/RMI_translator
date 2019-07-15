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
	 *Զ�̶���ʵ���࣬ʵ��Զ�̷������ı��ؽӿ� 
	 * @throws RemoteException 
	 */
	HashMap<String,String> words = new HashMap<String, String>();
	public TranslatorImpl() throws RemoteException{
		super();
		words.put("China", "n. �й�");
		words.put("German", "n. �ձ�");
		words.put("American", "n. �����ˣ�adj. ������");
		words.put("water", "n. ˮ");
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
