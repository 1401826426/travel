package com.fei.travel.item.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.fei.common.Response;
import com.fei.common.user.UserDto;

@RestController("/comment")
public class CommentController {
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public Response add(@SessionAttribute("userDto") UserDto userDto){
		return Response.ok() ; 
	}
	
	@RequestMapping(value = "/list/{itemId}/{type}",method = RequestMethod.GET)
	public Response list(@PathVariable("itemId") int itemId,@PathVariable("type") int type){
		return Response.ok() ; 
	}
	
	@RequestMapping(value = "/detail/{commentId}",method = RequestMethod.GET)
	public Response detail(@PathVariable("commentId") long commentId){
		return Response.ok() ; 
	}
	
	
	@RequestMapping(value = "/liked",method = RequestMethod.POST)
	public Response liked(@PathVariable("liked") long commentId){
		return Response.ok() ; 
	}
	
}








