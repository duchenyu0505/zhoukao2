package com.dcy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcy.entity.Column;
import com.dcy.entity.Conditions;

public interface ColumnDao {
	
		int insert(@Param("list")List<Column> list);
		
		List<Column> list(@Param("con")Conditions con);
		
		Column toUpdate(Integer id);
		
		int update(Column col);
}
