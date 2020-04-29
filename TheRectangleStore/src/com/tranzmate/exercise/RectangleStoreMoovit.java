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
 * Create function to check if rectangle is proper
 * Demand final rectangles
 * Throw exception if boundaries are improper
 * Insert sort to rectangles
 */
public class RectangleStoreMoovit implements IRectanglesStore {
	private IRectangle bounds;
	private ArrayList<IRectangle> rectangles;
	private ArrayList<IRectangle> defectiveRectangles;
	
	private boolean isRectangleProper(IRectangle rectangle) {
		 return (rectangle.getLeft() < rectangle.getRight() && rectangle.getBottom() < rectangle.getTop());
	}
	
	
	@Override
	public void initialize(IRectangle bounds, Collection<IRectangle> rectangles) {
		if(isRectangleProper(bounds))
			this.bounds = bounds;
		else
			return; /* TODO: throw exception */
		
		this.rectangles = new ArrayList<IRectangle>(rectangles);
		this.defectiveRectangles = new ArrayList<IRectangle>(rectangles);
		
		rectangles.forEach(rec -> {
			if(isRectangleProper(rec))
				this.rectangles.add(rec); /* TODO: maybe use sort insertion */
			else
				this.defectiveRectangles.add(rec);
		});

		this.rectangles.sort((IRectangle rec1, IRectangle rec2) -> rec2.getTop() - rec1.getTop());
	}
	
	/**
	 * 
	 * return the topmost rectangle per specified x, y location 
	 * (or null in case no rectangle exists in the specified location) 
	 * 
	 */
	/*
    TODO:
    use interface classes
    check that left<=right & top<=bottom
    check that points are inside main rectangle bounds

    Store rectangles:
    1. save rectangle points as tuple (left, top, right, bottom) into array
    2. insertion sort for every new rectangle

    Search topmost rectangle with (x,y) point
    3. Search from top rectangle to bottom rectangle
    4. while top>y
        Is bottom<=y?
            Is left<=x?
                Is right>=x?
                    return rectangle
    5. return null
     */

	@Override
	public IRectangle findRectangleAt(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
