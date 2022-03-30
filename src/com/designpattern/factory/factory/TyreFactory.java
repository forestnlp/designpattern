package com.designpattern.factory.factory;

import com.designpattern.factory.car.CarObject;
import com.designpattern.factory.car.Tyre;

public class TyreFactory implements Ifactory {
	public CarObject getInstance(){
		return new Tyre();
	}
}