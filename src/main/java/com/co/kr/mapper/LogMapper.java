package com.co.kr.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.co.kr.domain.LogDomain;

@Mapper
public interface LogMapper {
	
	// select all
	public List<LogDomain> logAllList(Map<String, Object> map);

	// select own
	public List<LogDomain> logOwnList(Map<String, Object> map);
	
	// count all
	public int logGetAll();
	
	// insert new one
	public void logUpload(HashMap<String, Object> map);
}
