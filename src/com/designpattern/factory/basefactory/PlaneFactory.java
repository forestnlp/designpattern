package com.designpattern.factory.basefactory;

public class PlaneFactory implements Ifactory {
	public Engine getEngine(){
		return new PlaneEngine();
	}
	public Baseplate getBaseplate(){
		return new PlaneBaseplate();
	}
	public GearBox getGearBox(){
		return new PlaneGearBox();
	}
	public Tyre getTyre(){
		return new PlaneTyre();
	}
}