package com.spdb.axis.util;

import java.util.Map;

/**
 * 
 * 公共学生信息工具类
 * 
 * @author Jack_David
 *
 */
public class StudAppUtil {

	/**
	 * 
	 * 调用内部服务
	 * 
	 * @param dataMap
	 *            请求数据集
	 * @param txnCode
	 *            交易码
	 * @return 返回交易的结果信息
	 */
	public static String invokeInnerService(Map<String,Object> dataMap, String txnCode) {
		
		String responseInfo = "";
		
		 if("getStudentMarks".equals(txnCode)){
			String studentNo = (String)dataMap.get("studentNo");
			String subjectNo = (String)dataMap.get("subjectNo");
			responseInfo = "学号=" + studentNo +",学科号="+subjectNo + ",成绩=98";
		}
		System.out.println(responseInfo);
		return responseInfo;
	}
}
