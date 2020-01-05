package lesson13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c=new Circle(3);
        c.draw();
        c.area();
        Triangle t=new Triangle(2,3);
        t.draw();
        t.area();
        try {
        t.setBase(0);    //not collapsing in java 12
        t.setHeight(6);
        if(t.getBase()==0 || t.getHeight()==0) {System.out.println("not a real triangle");}
        else {t.area();}
        }catch(ArithmeticException ex) {System.out.println("cannt be zero"+ex);}
        Square s=new Square(4);
        s.draw();
        s.area();
	}

}
