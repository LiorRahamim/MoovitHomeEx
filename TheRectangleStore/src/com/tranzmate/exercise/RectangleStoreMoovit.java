package com.tranzmate.exercise;

import java.util.ArrayList;
import java.util.Collection;

public class RectangleStoreMoovit implements IRectanglesStore {
	@Override
	public void initialize(IRectangle bounds, Collection<IRectangle> rectangles) {
		ArrayList<IRectangle> rectanglesByPositions = new ArrayList<IRectangle>(rectangles);
		rectanglesByPositions.forEach(rec -> System.out.println(rec.getTop()));

		rectanglesByPositions.sort((IRectangle rec1, IRectangle rec2) -> rec1.getTop() - rec2.getTop());
		rectanglesByPositions.forEach(rec -> System.out.println(rec.getTop()));
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
