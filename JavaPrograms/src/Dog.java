class bigDog {
    
    void run() {
        System.out.println("Dog runs");
    }
    void bark() {
        System.out.println("Dog barks");
    }
    void sleep() {
        System.out.println("Dog sleeps");
    }
    
}
class smallPuppy extends bigDog{
    void run() {
        System.out.println("Dog runs fast than puppy");
    }
    void playGames() {
        System.out.println("Puppy play games");
    }
    
}
public class Dog {
    public static void main(String[] args) {
        smallPuppy sp = new smallPuppy();
        sp.sleep();
        sp.run();
        sp.bark();
        sp.playGames();
        
    }
}