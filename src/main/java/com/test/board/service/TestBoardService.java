package com.test.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.board.mapper.TestBoardMapper;
import com.test.board.vo.TestBoardVO;

@Service
public class TestBoardService {

	@Resource
	private TestBoardMapper tbMapper;

	public List<TestBoardVO> selecTestBoardList(TestBoardVO tb) {
		return tbMapper.selectTestBoardList(tb);
	}

	public int insertTestBoard(TestBoardVO tb) {
		return tbMapper.insertTestBoard(tb);
	}

	public int updateTestBoard(TestBoardVO tb) {
		return tbMapper.updateTestBoard(tb);
	}

	public int deleteTestBoard(TestBoardVO tb) {
		return tbMapper.deleteTestBoard(tb);
	}

	public TestBoardVO selectTestBoard(TestBoardVO tb) {
		return tbMapper.selectTestBoard(tb);
	}
}
