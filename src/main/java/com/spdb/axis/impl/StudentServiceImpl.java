package com.spdb.axis.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spdb.axis.service.StudentService;
import com.spdb.axis.util.StudAppUtil;


/**
 * 
 * 公共学生信息服务的实现类
 * 
 * @author CJW
 *
 */
public class StudentServiceImpl implements StudentService {


	@Override
	public String getStudentMarks(String strInfoDo) {
		JSONObject map = JSON.parseObject(strInfoDo);
		return StudAppUtil.invokeInnerService(map, "getStudentMarks");
	}

	@Override
	public String getStudentList(String strInfoDo) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date(System.currentTimeMillis());
	    String time=format.format(date);
	    System.out.println(time);
		JSONArray list = JSON.parseArray(strInfoDo);
		System.out.println(list.get(0));
		return String.valueOf(list.size());
	}

	@Override
	public String getStudentInfo(String strInfoDo) {
		return "返回："+strInfoDo;
	}

}
