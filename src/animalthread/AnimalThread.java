
package animalthread;

public class AnimalThread extends Thread{
    private String name;
    private int limit;
    
    public AnimalThread(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }
    
    @Override 
    public void run() {
        for(int i = 0; i < limit; i++) {
            System.out.println(name + " moves forward");
        }
        
        System.out.println(name + " has made it to the goal");
        yield(); 
    }
}
