
package LAB11;


public class main {
    public static void main(String args[]){
        Duck duck = new Duck("My Duck"); 
        Cat cat = new Cat("My Cat");
        Eagle eagle = new Eagle("My Eagle");
        
        duck.fly();
        duck.move();
        duck.swim();
        
        cat.swim();
        
        eagle.fly();
        
    }
}
