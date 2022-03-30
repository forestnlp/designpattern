package com.designpattern.factory.cached;

import com.designpattern.factory.car.*;

import java.util.HashMap;
import java.util.Map;

public class Factory{
	private static final Map<String, CarObject> cachedpool = new HashMap<>();

	static {
		cachedpool.put("发动机",new Engine());
		cachedpool.put("底盘",new Baseplate());
		cachedpool.put("变速箱",new GearBox());
		cachedpool.put("轮胎",new Tyre());
	}
	public static CarObject getInstance(String type) {
		return cachedpool.get(type);
	}
}