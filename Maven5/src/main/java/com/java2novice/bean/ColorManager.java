package com.java2novice.bean;

public class ColorManager {

	MyColor color;

	public void printColor() {
		this.color.printColor();
	}

	public ColorManager(MyColor myColor) {
		this.color = myColor;
	}
}
