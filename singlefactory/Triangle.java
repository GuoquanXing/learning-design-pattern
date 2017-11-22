package singlefactory;

public class Triangle implements Shape {
	
	private int sideLength;
	private int height;
	
	public Triangle(int c , int h) {
		this.sideLength = c;
		this.height = h;
	}

	@Override
	public double calculateSquare() {
		return (sideLength * height) / 2;
	}

	@Override
	public double calculateCycle() {
		// TODO Auto-generated method stub
		return (sideLength + height) / 2;
	}

}
