package singlefactory;

public class Square implements Shape {
	
	private int c;
	
	public Square(int c) {
		this.c = c;
	}

	@Override
	public double calculateSquare() {
		return c * c;
	}

	@Override
	public double calculateCycle() {
		return 4 * c;
	}

}
