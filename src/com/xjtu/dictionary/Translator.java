package com.xjtu.dictionary;

import java.rmi.*;

//��Remote�ӿ�����RMI�ı��ؽӿ�
public interface Translator extends Remote {
	/**Զ�̶���ı��ؽӿ�
	 *
	 * @param str ��Ҫ������ĵ���
	 * @return Ӣ������Ľ�����������ʧ�ܷ���null
	 * @author hui-w
	 */
	public String translate(String str) throws RemoteException;
}
