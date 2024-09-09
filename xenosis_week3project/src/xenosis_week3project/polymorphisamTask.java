package xenosis_week3project;

class Vehicle
{
	public void name()
	{
		System.out.println("My name is vehicle");
	}
	
}

class Car extends Vehicle
{
	public void name()
	{
		System.out.println("My name is car");
	}
}

class Bike extends Vehicle
{
	public void name()
	{
		System.out.println("My name is Bike");
	}
}



public class polymorphisamTask {

	public static void main(String[] args)
	{
		Vehicle obj=new Car();
		obj.name();
		
		Vehicle obj2=new Bike();
		obj2.name();
		
		

	}

}
