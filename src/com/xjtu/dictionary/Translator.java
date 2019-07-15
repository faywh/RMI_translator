package com.xjtu.dictionary;

import java.rmi.*;

//从Remote接口派生RMI的本地接口
public interface Translator extends Remote {
	/**远程对象的本地接口
	 *
	 * @param str 需要被翻译的单词
	 * @return 英汉互译的结果，如果翻译失败返回null
	 * @author hui-w
	 */
	public String translate(String str) throws RemoteException;
}
