package xenosis_week3project;

abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	double radius=5;
	void calculateArea()
	{
		double area=3.14*radius*radius;
		
		System.out.println("area of circle is="+area);
	}
}

class Rectanle extends Shape
{
	
	double length=10;
	double bredth=20;
	void calculateArea()
	{
		double area=length*bredth;
		
		System.out.println("area of rectangle is="+area);
	}
}
class Triangle extends Shape
{
	double base=5;
	double height=4;
	void calculateArea()
	{
		double area=0.5*base*height;
		
		System.out.println("area of circle is="+area);
	}
}



public class Calculate_shapeTask {

	public static void main(String[] args) 
	{
		
       Shape Circle=new Circle();
        Circle.calculateArea();
        
        Shape Rectanle =new Rectanle();
        Rectanle.calculateArea();
        
        Shape Triangle =new Triangle ();
        Triangle.calculateArea();
	}

}
