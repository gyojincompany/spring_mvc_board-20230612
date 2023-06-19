package com.gyojincompany.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.gyojincompany.board.dao.BoardDao;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();		
		HttpServletRequest request = (HttpServletRequest) map.get("request");		
		
		BoardDao boardDao = new BoardDao();		
		
		model.addAttribute("boardDto", boardDao.view(request.getParameter("bid")));
		
	}

}
