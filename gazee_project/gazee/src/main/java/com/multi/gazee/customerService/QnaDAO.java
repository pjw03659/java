package com.multi.gazee.customerService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QnaDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(QnaVO bag) {
		my.insert("customer.create", bag);
	}
}
