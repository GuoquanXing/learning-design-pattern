package singlefactory;

import java.util.ArrayList;

public class FactoryClient {

	public static void main(String[] args) {
		ArrayList<Shape> als = new ArrayList<Shape>();

		als.add(ShapeFactory.createShapeSquare(3));
		als.add(ShapeFactory.createShapeTriangle(4, 3));

		for (Shape shape : als) {
			System.out.println(shape.calculateCycle());
			System.out.println(shape.calculateSquare());
		}

	}

}
