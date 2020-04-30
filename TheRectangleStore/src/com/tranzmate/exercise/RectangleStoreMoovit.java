package com.tranzmate.exercise;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Lior Rahamim
 *
 * Rectangle class for Moovit home assignment
 * 
 * Rectangles sides values are represented as:
 * Top should be bigger than bottom
 * Right should be bigger than left 
 */

public class RectangleStoreMoovit implements IRectanglesStore {
	private IRectangle bounds;
	private ArrayList<IRectangle> rectangles; 
	private ArrayList<IRectangle> defectiveRectangles;

	/**
	 * Initializing the store with boundaries and rectangles collection
	 * This method expects its arguments to be immutable
	 */
	@Override
	public void initialize(IRectangle bounds, Collection<IRectangle> rectangles) {
		if(bounds.isRectangleProper())
			this.bounds = bounds;
		else 
			throw new RuntimeException("Bounds rectangle is not proper");
				
		this.rectangles = new ArrayList<IRectangle>();
		this.defectiveRectangles = new ArrayList<IRectangle>();
		
		rectangles.forEach(rec -> {
			if(rec.isRectangleProper() && rec.isRectangleWithin(this.bounds))
				this.rectangles.add(rec); 
			else
				this.defectiveRectangles.add(rec);
		});
					
		this.rectangles.sort((IRectangle rec1, IRectangle rec2) -> rec2.getTop() - rec1.getTop());
	}

	/**
	 * 
	 * Returns the topmost rectangle per specified x, y location 
	 * (or null in case no rectangle exists in the specified location) 
	 * int x: sideways coordinate
	 * int y: height coordinate
	 * 
	 */
	@Override
	public IRectangle findRectangleAt(int x, int y) {
		if(!this.bounds.isPointWithin(x, y))
			return null;

		for(IRectangle rec : this.rectangles) {
			// Reached rectangles too low
			if(y > rec.getTop())
				return null;
			
			if(rec.isPointWithin(x, y))
				return rec;
		}
		
		// No matching rectangles
		return null;
	}
}