package com.tranzmate.exercise;

import java.util.Random;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<IRectangle> rectangles = new Stack<>();
		Random rand = new Random();
		RectangleStoreMoovit store;
		BoringRectangle bounds;

		//bounds = new BoringRectangle(rand.nextInt(10000), rand.nextInt(10000), rand.nextInt(10000), rand.nextInt(10000));
		bounds = new BoringRectangle(0,100,100,0);

		for(int i = 0; i < 10; i++) {
			rectangles.push(new BoringRectangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)));
		}

		store = new RectangleStoreMoovit();
		store.initialize(bounds, rectangles);
				
		System.out.println("Bounds: ltrb " + bounds.toString());
		rectangles.forEach(rec -> System.out.println(rec.toString()));
		System.out.println();
		store.rectangles.forEach(rec -> System.out.println(rec.toString()));

		System.out.println();
		System.out.println(store.findRectangleAt(40, 60).toString());
	}

}
