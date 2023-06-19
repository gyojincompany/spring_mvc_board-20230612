package com.gyojincompany.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.gyojincompany.board.dao.BoardDao;
import com.gyojincompany.board.dto.BoardDto;

public class BListCommand implements BCommand{
	
	public void execute(Model model) {
		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> boardDtos = boardDao.list();
		
		model.addAttribute("list", boardDtos);
		model.addAttribute("total", boardDtos.size());
	}

}
