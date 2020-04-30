package com.tranzmate.exercise.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Random;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import com.tranzmate.exercise.BoringRectangle;
import com.tranzmate.exercise.IRectangle;
import com.tranzmate.exercise.RectangleStoreMoovit;

public class TestRectangleStoreMoovit {
	RectangleStoreMoovit store;
	BoringRectangle topmost;

	@Before
	public void setUp() {	
		testInitialize();
	}
	
	@Test
    public void testInitialize() {
		Stack<IRectangle> rectangles = new Stack<>();
		BoringRectangle bounds;
				
		bounds = new BoringRectangle(0,100,100,0);

		rectangles.push(new BoringRectangle(1, 2, 3, 4));
		rectangles.push(new BoringRectangle(10, 2, 3, 40));
		rectangles.push(new BoringRectangle(1, 20, 3, 40));
		rectangles.push(new BoringRectangle(1, 2, 30, 40));
		rectangles.push(new BoringRectangle(10, 20, 30, 4));
		rectangles.push(new BoringRectangle(1, 2, 30, 400));
		rectangles.push(new BoringRectangle(1000, 20, 300, 4));
		rectangles.push(new BoringRectangle(1, 2000, 30, 40));
		rectangles.push(new BoringRectangle(10, 20, 300, 40));
		rectangles.push(topmost = new BoringRectangle(10, 99, 20, 40));
				
		store = new RectangleStoreMoovit();
		store.initialize(bounds, rectangles);

    }
	
	@Test
	public void testFindRectangleAt() {
		IRectangle expectedTopmost;
		
		expectedTopmost = store.findRectangleAt(15, 45);
		
		assertEquals(expectedTopmost, this.topmost);
	}
}
