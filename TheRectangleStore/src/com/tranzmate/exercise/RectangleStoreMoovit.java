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


/*
 * TODO:
 * Demand rectangles to be immutable/final
 * Throw exception if boundaries are improper on initialization
 * Insert sort to rectangles
 */
public class RectangleStoreMoovit implements IRectanglesStore {
	// TODO: change to private
	public IRectangle bounds;
	public ArrayList<IRectangle> rectangles; 
	public ArrayList<IRectangle> defectiveRectangles;
	
	private boolean isRectangleProper(IRectangle rectangle) {
		 return (rectangle.getLeft() < rectangle.getRight() 
				 && rectangle.getBottom() < rectangle.getTop());
	}
	
	private boolean isRectangleWithin(IRectangle rec, IRectangle bounds) {
		return rec.getTop() < bounds.getTop()
				&& rec.getBottom() > bounds.getBottom()
				&& rec.getLeft() > bounds.getLeft()
				&& rec.getRight() < bounds.getRight();
	}
	
	private boolean isPointWithin(int x, int y, IRectangle bounds) {
		return y < bounds.getTop()
				&& y > bounds.getBottom()
				&& x > bounds.getLeft()
				&& x < bounds.getRight();
	}
	
	/**
	 * Initializing the store with boundaries and rectangles collection
	 */
	@Override
	public void initialize(IRectangle bounds, Collection<IRectangle> rectangles) {
		if(isRectangleProper(bounds))
			this.bounds = bounds;
		else
			return; /* TODO: throw exception */
		
		this.rectangles = new ArrayList<IRectangle>();
		this.defectiveRectangles = new ArrayList<IRectangle>();
		
		rectangles.forEach(rec -> {
			if(isRectangleProper(rec) && isRectangleWithin(rec, this.bounds))
				this.rectangles.add(rec); // TODO: maybe use sort insertion 
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
		if(!isPointWithin(x, y, this.bounds))
			return null;

		/*
		 * TODO: maybe change to foreach
		 */
		for(IRectangle rec : this.rectangles) {
			// Reached rectangles too low
			if(y > rec.getTop())
				return null;
			
			if(isPointWithin(x, y, rec))
				return rec;
		}
		
		// No matching rectangles
		return null;
	}
}