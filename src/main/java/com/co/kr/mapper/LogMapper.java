package com.co.kr.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.co.kr.domain.LogDomain;

@Mapper
public interface LogMapper {
	
	// select all
	public List<LogDomain> logList();
	
	// count all
	public int logGetAll();
	
	// insert new one
	public void logUpload(HashMap<String, Object> map);
}
