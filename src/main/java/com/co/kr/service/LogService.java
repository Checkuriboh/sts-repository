package com.co.kr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.co.kr.domain.BoardContentDomain;
import com.co.kr.domain.LogDomain;

public interface LogService {
	
	// 전체 로그 조회
	public List<LogDomain> logAllList(Map<String, Object> map);

	// 개인 로그 조회
	public List<LogDomain> logOwnList(Map<String, Object> map);

	// 로그 갯수 조회
	public int logGetAll();
	
	// 로그 추가
	public void logCreate(String crud, BoardContentDomain boardContentDomain);
}
