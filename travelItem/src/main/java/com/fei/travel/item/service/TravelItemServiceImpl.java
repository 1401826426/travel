package com.fei.travel.item.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fei.common.Response;
import com.fei.travel.item.mapper.ItemMapper;

public class TravelItemServiceImpl implements TravelItemService{
	
	@Autowired
	private ItemMapper itemMapper ; 

	@Override
	public Response list(int type, int st, int limit) {
//		ItemExample itemExample = new ItemExample() ; 
//		itemMapper.list(type,st,limit) ; 
		return null;
	}

	@Override
	public Response detail(int id) {
		return null;
	}

}















