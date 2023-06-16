package com.gyojincompany.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.board.dao.BoardDao;
import com.gyojincompany.board.dto.BoardDto;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		return "write_form";
	}
	
	@RequestMapping(value = "/write" )
	public String write(HttpServletRequest request) {
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BoardDao boardDao = new BoardDao();
		boardDao.write(bname, btitle, bcontent);
		
		return "";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("list", boardDtos);
		
		return "list";
	}
}
