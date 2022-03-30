package com.designpattern.factory.simple;

import com.designpattern.factory.car.CarObject;

public class Factory{
	public static CarObject getInstance(String obj) {
		return new CarObject();
	}
}