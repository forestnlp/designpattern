package com.designpattern.factory.factory;

import com.designpattern.factory.car.Baseplate;
import com.designpattern.factory.car.CarObject;

public class BaseplateFactory implements Ifactory {
	public CarObject getInstance(){
		return new Baseplate();
	}
}