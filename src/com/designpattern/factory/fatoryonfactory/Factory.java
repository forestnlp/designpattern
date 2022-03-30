package com.designpattern.factory.fatoryonfactory;

import com.designpattern.factory.car.CarObject;
import com.designpattern.factory.factory.*;

import java.util.HashMap;
import java.util.Map;

public class Factory{
	private static final Map<String, Ifactory> cachedpool = new HashMap<>();

	static {
		cachedpool.put("发动机",new EngineFactory());
		cachedpool.put("底盘",new BaseplateFactory());
		cachedpool.put("变速箱",new GearBoxFactory());
		cachedpool.put("轮胎",new TyreFactory());
	}
	public static Ifactory getFactory(String type) {
		return cachedpool.get(type);
	}
}