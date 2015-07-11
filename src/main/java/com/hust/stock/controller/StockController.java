package com.hust.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hust.stock.dao.IStockDAO;
import com.hust.stock.domain.StockZJZH;
import com.hust.stock.service.IStockService;

@Controller
public class StockController {
	
	@Autowired
	IStockService stockService;
	
	@ResponseBody  
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public List<StockZJZH> test(){
		System.out.println("test");
		List<StockZJZH> list = stockService.getStockZJZHList();
		return list;
	}

}
