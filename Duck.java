
package LAB11;


public class Duck extends Animal implements Moveable, Flyable, Swimmable {
    
    public Duck(String name){
        this.name = name;
    }
    
    @Override
    public void swim(){
        System.out.println(name + " is swimming");
    }
    
    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }
    
    @Override
    public void move(){
        System.out.println(name + " is moving");
    }
    
    
}
