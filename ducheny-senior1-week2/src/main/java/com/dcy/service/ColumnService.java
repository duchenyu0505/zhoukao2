package com.dcy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcy.entity.Column;
import com.dcy.entity.Conditions;

public interface ColumnService {
	
		List<Column> read();
		
		List<Column> list(Conditions con);
		
		Column toUpdate(Integer id);
		
		int update(Column col);
		
}
