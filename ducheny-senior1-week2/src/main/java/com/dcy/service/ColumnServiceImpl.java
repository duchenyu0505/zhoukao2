package com.dcy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcy.StringUtil;
import com.dcy.fileUtil;
import com.dcy.dao.ColumnDao;
import com.dcy.entity.Column;
import com.dcy.entity.Conditions;

@Service
public class ColumnServiceImpl implements ColumnService{

	@Autowired
	private ColumnDao columnDao;
	
	@Override
	public List<Column> read() {
		
		//读取文本文件
		List<String> list = fileUtil.readTextFileOfList("C:\\Users\\dcy\\Desktop\\cms附件-机械设备公司年检信息.txt");
		
		//创建list集合 存放数据
		List<Column> clist = new ArrayList<Column>();
		
		for(int i=0;i<1;i++) {
			
			String[] lists = list.get(i).split("\t");
			
			Column c = new Column();
			
			/*
			 * if(StringUtil.isNumber(lists[0])) { c.setId(Integer.parseInt(lists[0]));
			 * continue; }
			 */
			if(StringUtil.isNotBlank(lists[1])) {
				c.setDesc(lists[1]);
				continue;
			}
			if(StringUtil.isNotBlank(lists[2])) {
				c.setName(lists[2]);
				continue;
			}
			if(StringUtil.isNotBlank(lists[3])) {
				c.setKeyword(lists[3]);
				continue;
			}
			if(StringUtil.isNotBlank(lists[4])) {
				c.setAddress(lists[4]);
				continue;
			}
			if(StringUtil.isNumber(lists[5])&&StringUtil.isNotBlank(lists[5])) {
				c.setMoney(Integer.parseInt(lists[5]));
				continue;
			}
			
			if(StringUtil.isNotBlank(lists[6])) {
				c.setBirth(lists[6]);
				continue;
			}
			if(StringUtil.isBlank(lists[7])) {
				c.setYear(null);
			}else {
				c.setYear(lists[7]);
			}
			
			c.setStatus(lists[8]);
			c.setBz(lists[9]);
			clist.add(c);
		}System.out.println(list);
		int res=columnDao.insert(clist);
		System.out.println(list);
		return clist;
	}

	@Override
	public List<Column> list(Conditions con) {
		// TODO Auto-generated method stub
		return columnDao.list(con);
	}

	@Override
	public Column toUpdate(Integer id) {
		// TODO Auto-generated method stub
		return columnDao.toUpdate(id);
	}

	@Override
	public int update(Column col) {
		// TODO Auto-generated method stub
		return columnDao.update(col);
	}

}
