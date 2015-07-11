package com.hust.stock.dao;

import java.util.List;

import com.hust.stock.domain.StockZJZH;

public interface IStockDAO {
	
	public List<StockZJZH> findCapitalAccount();

}
