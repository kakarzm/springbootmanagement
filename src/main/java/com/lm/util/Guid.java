package com.lm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取相关的guid
 * @author lin
 *
 */
public class Guid {
	/**
	 * 返回调用此方法返回字符串yyyyMMddHHmmssSSS+5位随机数字
	 * 
	 * @return String
	 */
	public static String get() {
		StringBuffer now = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
		int n = (int) (Math.random() * 90000 + 10000);
		return now.append(n).toString();
	}
}
