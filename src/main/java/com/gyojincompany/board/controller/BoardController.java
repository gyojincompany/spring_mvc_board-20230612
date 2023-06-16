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
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("list", boardDtos);
		
		return "list";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) { 
		
		BoardDao boardDao = new BoardDao();
		BoardDto boardDto = boardDao.view(request.getParameter("bid"));
		
		model.addAttribute("boardDto", boardDto);
		
		return "content_view";
	}
	
	@RequestMapping(value = "/modify_form")
	public String modify_form(HttpServletRequest request, Model model) {
		
		BoardDao boardDao = new BoardDao();
		BoardDto boardDto = boardDao.view(request.getParameter("bid"));
		
		model.addAttribute("boardDto", boardDto);
		
		return "modify_form";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request) {
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bid = request.getParameter("bid");
		
		BoardDao boardDao = new BoardDao();
		boardDao.modify(btitle, bcontent, bid);
		
		return "redirect:list";
	}
}
