package com.gyojincompany.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.gyojincompany.board.dao.BoardDao;

public class BDeleteCommand implements BCommand {
	
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();		
		HttpServletRequest request = (HttpServletRequest) map.get("request");		
		
		BoardDao boardDao = new BoardDao();
		boardDao.delete(request.getParameter("bid"));
	}
	
}
