class Plane //Parent
{
	void takeoff() {
		System.out.println("Plane took off");
	}
	void fly() { //overriden method
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane landed");
	}
}

class CargoPlane extends Plane{
	void fly() { //overriden method
		System.out.println("CargoPlane is flying at lower heights");
	}
	void carryGoods() { //specialized method
		System.out.println("CargoPlane Carry goods");
	}
}
public class Launch {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.takeoff();//parent
		cp.fly();//child
		cp.land();//parent
		cp.carryGoods();//child
		
		Plane p;//parent reference
		
		p=cp;//object reference can also be the parent reference
		
		//calling child methods using parent reference
		p.takeoff();
		p.fly();
		p.land();
		//p.carryGoods();//specialized methods of child cannot be accessed by parent
	}
}