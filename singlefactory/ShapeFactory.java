package singlefactory;

public class ShapeFactory {
	
	public static Shape createShapeTriangle(int d, int h){
		return new Triangle(d,h);
	}
	
	public static Square createShapeSquare(int c){
		return new Square(c);
	}
}
