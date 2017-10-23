
package com.test.goods.db.dao;

import java.util.List;
import java.util.Map;

import com.test.goods.db.dto.Column;
import com.test.goods.db.dto.DBInfo;
import com.test.goods.db.dto.DataBase;
import com.test.goods.db.dto.Table;

public interface DBDao {

	public List<DBInfo> selectDBInfoList(DBInfo di);
	public DBInfo selectDBInfo(DBInfo di);
	public boolean isConnecteDB(DBInfo di) throws Exception;
	public List<DataBase> selectDatabaseList() throws Exception;
	public List<Table> selectTableList(DataBase di) throws Exception;
	public List<Column> selectTableInfo(Table table) throws Exception;
	public Map<String,Object> runSql(Map<String, String>pm) throws Exception;
	public Map<String,Object> runSqls(Map<String, List>pm) throws Exception;
}
