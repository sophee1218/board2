package com.test.board.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.board.vo.TestCommentVO;

@RestController
public class TestCommentController {

	@PostMapping("/tc/new")
	public int insertTestComment(TestCommentVO tc) {
		return 1;
	}
}
