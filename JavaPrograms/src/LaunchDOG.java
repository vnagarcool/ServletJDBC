class Dog{
    //Instance variables
    private String name;
    private String color;
    private int age;
    private int cost;
    private String breed;
    
    public Dog(){
        name = "rocky";
        color = "green";
        cost = 7000;
        age = 1;
        breed = "pug";
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String name, String breed) {
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

public class LaunchDOG {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Bunny");
        Dog d3 = new Dog("bunny",3);
        Dog d4 = new Dog("bunny","pug");
  

System.out.println(d1.getAge());
System.out.println(d1.getBreed());
System.out.println(d1.getColor());
System.out.println(d1.getCost());
System.out.println(d1.getName());
System.out.println("------------------------");
System.out.println(d2.getAge());
System.out.println(d2.getBreed());
System.out.println(d2.getColor());
System.out.println(d2.getCost());
System.out.println(d2.getName());
System.out.println("------------------------");
System.out.println(d3.getAge());
System.out.println(d3.getBreed());
System.out.println(d3.getColor());
System.out.println(d3.getCost());
System.out.println(d3.getName());
System.out.println("------------------------");
System.out.println(d4.getAge());
System.out.println(d4.getBreed());
System.out.println(d4.getColor());
System.out.println(d4.getCost());
System.out.println(d4.getName());
}
}

