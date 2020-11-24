package com.test.board.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.board.service.TestBoardService;
import com.test.board.vo.TestBoardVO;

@RestController
public class TestBoardController {

	@Resource
	private TestBoardService tbService;

	@GetMapping("/tbs")
	public List<TestBoardVO> getTestBoards(TestBoardVO tb) {
		return tbService.selecTestBoardList(tb);
	}

	@PostMapping("/tb/new")
	public int insertTestBoard(@ModelAttribute TestBoardVO tb) {
		return tbService.insertTestBoard(tb);
	}

	@PostMapping("/tb/update")
	public int updateTestBoard(@ModelAttribute TestBoardVO tb) {
		return tbService.updateTestBoard(tb);
	}

	@PostMapping("/tb/delete")
	public int deleteTestBoard(@ModelAttribute TestBoardVO tb) {
		return tbService.deleteTestBoard(tb);
	}

	@GetMapping("/tb/{tbNum}")
	public TestBoardVO selectTestBoard(@PathVariable Integer tbNum) {
		TestBoardVO tb = new TestBoardVO();
		tb.setTbNum(tbNum);
		return tbService.selectTestBoard(tb);
	}
}
