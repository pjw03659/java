package com.multi.gazee.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnaController {

	@Autowired
	QnaDAO dao;
	
	@RequestMapping("insert")
	public void insert(QnaVO bag) {
		dao.insert(bag);

	}
}
