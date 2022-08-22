/*
 * class Object
 * {
 * 		public Object()
 * 		{
 * 		
 * 		}
 * }
 */
//orphan class
class Dog1  
{
	//Instance variables
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	
	//fourth constructor to be called
	public Dog1(){
		super();//constructor chaining
		name = "rocky";
		color = "green";
		cost = 7000;
		age = 1;
		breed = "pug";
	}
	//third constructor to be called
	public Dog1(String name) {
		this();
		this.name = name;
	}
	//second constructor to be called
	public Dog1(String name, int age) {
		this("jerry");
		this.name = name;
		this.age = age;
	}
	//first constructor to be called
	public Dog1(String name, String breed) {
		this("brocky",25);
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
public class LaunchDog1 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1("Tommy","GR");
		
		System.out.println(d1.getAge());
		System.out.println(d1.getBreed());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getName());
		
	}
}