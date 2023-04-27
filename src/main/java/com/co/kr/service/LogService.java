package com.co.kr.service;

import java.util.HashMap;
import java.util.List;

import com.co.kr.domain.BoardContentDomain;
import com.co.kr.domain.LogDomain;

public interface LogService {
	
	// 전체 리스트 조회
	public List<LogDomain> logList();

	// 전체 갯수 조회
	public int logGetAll();
	
	// 로그 추가
	public void logCreate(String crud, BoardContentDomain boardContentDomain);
}
