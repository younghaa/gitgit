package com.test.goods.goods.dao;

import java.util.List;

import com.test.goods.goods.dto.GoodsInfo;

public interface GoodsDao {

	public GoodsInfo selectGoodsInfo(GoodsInfo gi);
	
	public List<GoodsInfo> selectGoodsInfoList(GoodsInfo gi);
	
	public int insertGoodsInfo(GoodsInfo gi);
	
	public int updateGoodsInfo(GoodsInfo gi);
	
	public int deleteGoodsInfo(GoodsInfo gi);
}
