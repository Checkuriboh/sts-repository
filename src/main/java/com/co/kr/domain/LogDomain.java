package com.co.kr.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="builder")
public class LogDomain {

	private int logSeq;
	private int bdSeq;
	private String mbId;
	private String bdTitle;
	private String logCrud;
	private String bdUpdateAt;
	
}
