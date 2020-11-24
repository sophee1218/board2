package com.test.board.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("tc")
public class TestCommentVO {
	private Integer tcNum;
	private Integer tbNum;
	private String tcContent;
	private String tcWriter;
	private String tcCredate;
	private String tcDepth;
	private String tcParent;
}
