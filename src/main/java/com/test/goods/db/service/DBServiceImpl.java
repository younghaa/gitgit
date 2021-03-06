package com.test.goods.db.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.goods.db.dao.DBDao;
import com.test.goods.db.dto.Column;
import com.test.goods.db.dto.DBInfo;
import com.test.goods.db.dto.DataBase;
import com.test.goods.db.dto.Table;

@Repository
public class DBServiceImpl implements DBService{
	
	@Autowired
	DBDao dDao;

	@Override
	public List<DBInfo> getDBInfoList(DBInfo di) {
		return dDao.selectDBInfoList(di);
	}

	@Override
	public boolean isConnecteDB(DBInfo pDi) throws Exception {
		DBInfo di = dDao.selectDBInfo(pDi);
		return dDao.isConnecteDB(di);
	}

	@Override
	public List<DataBase> getDataBaseList() throws Exception {
		return dDao.selectDatabaseList();
	}

	@Override
	public List<Table> getTableList(DataBase di) throws Exception {
		return dDao.selectTableList(di);
	}

	@Override
	public List<Column> getTableInfo(Table table) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableInfo(table);
				}

	@Override
	public Map<String, Object> runSql(Map<String, String> pm) throws Exception {
		// TODO Auto-generated method stub
		return dDao.runSql(pm);
	}

	@Override
	public Map<String, Object> runSqls(Map<String, List> pm) throws Exception {
		// TODO Auto-generated method stub
		return dDao.runSqls(pm);
	}


}
