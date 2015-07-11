package com.hust.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hust.stock.dao.IStockDAO;
import com.hust.stock.domain.StockZJZH;
import com.hust.stock.service.IStockService;

@Service
public class StockServiceImpl implements IStockService{
	
	@Autowired
	private IStockDAO iStockDAO;
	
	public List<StockZJZH> getStockZJZHList(){
		System.out.println("testservice");
		List<StockZJZH> list = iStockDAO.findCapitalAccount();
		return list;
	}
	
	
}
