package lesson13;

public class Square implements Shape{
   private int base;

@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing a square []");
}

@Override
public void area() {
	// TODO Auto-generated method stub
	System.out.println(String.format("The square's area is: %s",base*base));
}

public Square(int base) {
	this.base = base;
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.toString();
}

}
