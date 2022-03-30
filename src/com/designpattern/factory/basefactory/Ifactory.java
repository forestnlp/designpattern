package com.designpattern.factory.basefactory;

public interface Ifactory{
	Engine getEngine();
	Baseplate getBaseplate();
	GearBox getGearBox();
	Tyre getTyre();
}