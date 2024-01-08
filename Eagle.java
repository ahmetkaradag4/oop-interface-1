
package LAB11;


public class Eagle extends Animal implements Moveable, Flyable, Swimmable {
    
    public Eagle(String name){
        this.name = name;
    }
    
    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }

    @Override
    public void move() {}

    @Override
    public void swim() {}

}
