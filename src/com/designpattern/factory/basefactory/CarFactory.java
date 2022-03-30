package com.designpattern.factory.basefactory;

public class CarFactory implements Ifactory {
	public Engine getEngine(){
		return new CarEngine();
	}
	public Baseplate getBaseplate(){
		return new CarBaseplate();
	}
	public GearBox getGearBox(){
		return new CarGearBox();
	}
	public Tyre getTyre(){
		return new CarTyre();
	}
}