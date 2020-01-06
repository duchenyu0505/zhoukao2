package com.dcy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcy.entity.Column;
import com.dcy.entity.Conditions;
import com.dcy.service.ColumnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ColumnController {

	
	@Autowired
	private ColumnService colService;
	
	@RequestMapping("list.do")
	public String list(Model m,Conditions con,@RequestParam(defaultValue = "1")Integer currentPage) {
		
		PageHelper.startPage(currentPage, 3);
		
		List<Column> list = colService.list(con);
		
		PageInfo pageInfo=new PageInfo(list);
		
		m.addAttribute("list",list);
		m.addAttribute("pageInfo",pageInfo);
		m.addAttribute("con",con);
		m.addAttribute("currentPage",currentPage);
		return "list";
	}
	
	
	@ResponseBody
	@RequestMapping("col.do")
	public Object toUpdate(Integer id) {
		Column col = colService.toUpdate(id);
		return col;
	}
	
	@ResponseBody
	@RequestMapping("upd.do")
	public Object update(Column col) {
		int i=colService.update(col);
		return i>0;
	}
}
