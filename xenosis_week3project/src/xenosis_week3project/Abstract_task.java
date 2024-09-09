package xenosis_week3project;

interface colorOfAnimal
{
	void color();
}
abstract class Animal
{
	public abstract void sound();
}

class Cat extends Animal implements colorOfAnimal
{
	public void sound()
	{
		System.out.println("cat sound is meows");
	}
	
	public void color()
	{
		System.out.println("cat color is white");
	}
}

class Dog extends Animal implements colorOfAnimal
{
	public void sound()
	{
		System.out.println(" dog is barking ");
	}
	
	public void color()
	{
		System.out.println("dog color is brown");
	}
}

public class Abstract_task {

	public static void main(String[] args)
	{
		Animal Cat=new Cat();
		Animal Dog =new Dog();
		
		colorOfAnimal Cat1=new Cat();
		colorOfAnimal Dog1 =new Dog();
		
		Cat.sound();
		Cat1.color();
		
		Dog.sound();
		Dog1.color();

	}

}
