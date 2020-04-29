package com.tranzmate.exercise;

import java.util.Random;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<IRectangle> rectangles = new Stack<>();
		Random rand = new Random();
		RectangleStoreMoovit store;
		
		for(int i = 0; i < 10; i++) {
			rectangles.push(new BoringRectangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)));
		}
		
		System.out.println("1");
		rectangles.forEach(rec -> System.out.println(rec.toString()));
		store = new RectangleStoreMoovit();
		store.initialize(new BoringRectangle(rand.nextInt(10000), rand.nextInt(10000), rand.nextInt(10000), rand.nextInt(10000)), rectangles);
		System.out.println("4");
		rectangles.forEach(rec -> System.out.println(rec.toString()));
	}

}
