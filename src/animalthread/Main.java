
package animalthread;

public class Main {
    
    public static void main(String[] args) {
        AnimalThread bunny = new AnimalThread("Bunny", 100); 
        AnimalThread turtle = new AnimalThread("Turtle", 100); 
        AnimalThread fox = new AnimalThread("Fox", 100); 
        
        bunny.start();
        turtle.start();
        fox.start();
        System.out.println("Race has finished");
    }
}
