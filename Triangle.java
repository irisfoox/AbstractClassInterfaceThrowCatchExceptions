package lesson13;

public class Triangle implements Shape{
   private double height;
   private double base;
@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing a triangle |>");
}
@Override
public void area() throws ArithmeticException{
	// TODO Auto-generated method stub
	System.out.println(String.format("The triangle's area is: %s"
			, height*base/2));
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.toString();
}
public Triangle(double height, double base) {
	this.height = height;
	this.base = base;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}

}
