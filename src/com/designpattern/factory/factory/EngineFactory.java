package com.designpattern.factory.factory;

import com.designpattern.factory.car.CarObject;
import com.designpattern.factory.car.Engine;

public class EngineFactory implements Ifactory {
	public CarObject getInstance(){
		return new Engine();
	}
}