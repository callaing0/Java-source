package com.simple.classex;

public class Rectagle {
	int width;
	int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;		
	}
	
	@Override
	public String toString() {
		return "Rectagle [width=" + width + ", height=" + height + "]";
	}
       

}
