package com.tranzmate.exercise;

import java.util.Properties;

public interface IRectangle {
    int getLeft();
    int getTop();
    int getRight();
    int getBottom();
    Properties getProperties();
    
    public default boolean isRectangleProper() {
		 return (this.getLeft() < this.getRight()
				 && this.getBottom() < this.getTop());
	}
    
    public default boolean isRectangleWithin(IRectangle bounds) {
		return bounds.isPointWithin(this.getLeft(), this.getBottom())
				&& bounds.isPointWithin(this.getRight(), this.getTop());
	}
    
    public default boolean isPointWithin(int x, int y) {
		return isBetween(this.getBottom(),this.getTop(), y)
				&& isBetween(this.getLeft(),this.getRight(), x);
	}

	public static boolean isBetween(int low, int high, int middle){
		return low<middle && middle<high;
	}
}
