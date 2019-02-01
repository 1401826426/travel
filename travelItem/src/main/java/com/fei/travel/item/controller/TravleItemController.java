package com.fei.travel.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fei.common.Response;
import com.fei.travel.item.service.TravelItemService;

@RestController("/item")
public class TravleItemController {
	
	@Autowired
	private TravelItemService travelItemService ; 
	
	@RequestMapping(value="/list/{type}/{st}/{limit}",method=RequestMethod.GET)
	public Response list(@PathVariable("type")int type,@PathVariable("st")int st,@PathVariable("limit") int limit){
		return travelItemService.list(type,st,limit); 
	}
	
	@RequestMapping(value="/detail/{id}",method=RequestMethod.GET)
	public Response detail(@PathVariable("id")int id){
		return travelItemService.detail(id) ; 
	}
	
	

}








