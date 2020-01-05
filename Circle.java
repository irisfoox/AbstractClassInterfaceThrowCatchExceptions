package lesson13;

public class Circle implements Shape{
    
	private int radius;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	System.out.println("Drawing a circle o");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(String.format("The circle's area is: %s", radius*radius*3.14));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
