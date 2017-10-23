package com.test.goods.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.goods.goods.dao.GoodsDao;
import com.test.goods.goods.dto.GoodsInfo;
import com.test.goods.goods.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService gs;
	@Autowired
	private GoodsDao gDao;
	
	
	@RequestMapping(value="/goods/list",method=RequestMethod.POST)
	public @ResponseBody List<GoodsInfo> getGoodsInfoList(GoodsInfo gi){
		return gs.getGoodsInfoList(gi);
	}
	@RequestMapping(value="/goods/create",method=RequestMethod.POST)
	public @ResponseBody List<GoodsInfo> insertGoodsInfoList(@RequestBody GoodsInfo[] goodsList,GoodsInfo gi){
		gs.insertGoodsInfoList(goodsList);
		return gs.getGoodsInfoList(gi);
	}
	
	@RequestMapping(value="/goods/delete",method=RequestMethod.POST)
	public @ResponseBody GoodsInfo deleteGoodsInfo(@RequestBody GoodsInfo gi){
		gs.deleteGoodsInfo(gi);
		return gs.getGoodsInfo(gi);
	}
	@RequestMapping(value="/goods/update",method=RequestMethod.POST)
	public @ResponseBody GoodsInfo updateGoodsInfo(@RequestBody GoodsInfo gi){
		gs.updateGoodsInfo(gi);
		return gs.getGoodsInfo(gi);
	}
}
