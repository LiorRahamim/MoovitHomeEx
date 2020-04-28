package com.tranzmate.exercise;

import java.util.ArrayList;
import java.util.Collection;

public class RectangleStoreMoovit implements IRectanglesStore {
	/**
	 * 
	 * The inner class stores a rectangle with any of his sides, 
	 * for sorting purposes
	 *
	 */
	private class RectanglePosition {
		private int position;
		private IRectangle rectangle; 
		
		public RectanglePosition(int position, IRectangle rectangle) {
			this.position = position;
			this.rectangle = rectangle;
		}
		
		public int getPosition() {
			return this.position;
		}
		
		public IRectangle getRectangle() {
			return this.rectangle;
		}
	}
	
	@Override
	public void initialize(IRectangle bounds, Collection<IRectangle> rectangles) {
		ArrayList<IRectangle> rectanglesByTop = new ArrayList<>(); 
		ArrayList<IRectangle> rectanglesByLeft = new ArrayList<>();
	}
	
	/**
	 * 
	 * return the topmost rectangle per specified x, y location 
	 * (or null in case no rectangle exists in the specified location) 
	 * 
	 */
	@Override
	public IRectangle findRectangleAt(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
