package com.designpattern.factory.factory;

import com.designpattern.factory.car.CarObject;
import com.designpattern.factory.car.GearBox;

public class GearBoxFactory implements Ifactory {
	public CarObject getInstance(){
		return new GearBox();
	}
}