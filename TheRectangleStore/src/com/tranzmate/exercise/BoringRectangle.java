package com.tranzmate.exercise;

import java.util.Properties;

public final class BoringRectangle implements IRectangle {
	public int left;
	public int top;
	public int right;
	public int bottom;
	
	public BoringRectangle (int left, int top, int right, int bottom) {
		this.bottom = bottom;
		this.left = left;
		this.right = right;
		this.top = top;
	}
	
	@Override
	public int getLeft() {
		return this.left;
	}
	@Override
	public int getTop() {
		return this.top;
	}
	@Override
	public int getRight() {
		return this.right;
	}
	@Override
	public int getBottom() {
		return this.bottom;
	}
	@Override
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		return "left: " + this.getLeft() + " top: " + this.getTop() + " right: " + this.getRight() + " bottom: " + this.bottom;
	}

}
