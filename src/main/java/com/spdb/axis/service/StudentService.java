package com.spdb.axis.service;

/**
 * 
 * 公共的学生信息服务接口
 * 
 * @author CJW
 *
 */
public interface StudentService {


	String getStudentInfo(String strInfoDo);
	

	/**
	 * 根据学号和学科号获取成绩
	 * 
	 * @param studentNo
	 *            学生学号
	 * @param subjectNo
	 *            学科号
	 * @return 成绩
	 */
	String getStudentMarks(String strInfoDo);
	
	

	/**
	 * 获取大量LIST
	 * 
	 * @param studentNo
	 *            学生学号
	 * @param subjectNo
	 *            学科号
	 * @return 成绩
	 */
	String getStudentList(String strInfoDo);


}
