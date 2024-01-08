
package LAB11;


public class Cat extends Animal implements Moveable, Flyable, Swimmable {
    public Cat(String name){
        this.name = name;
    }
    
    @Override
    public void swim(){
        System.out.println(name + " is swimming");
    }

    @Override
    public void move(){};

    @Override
    public void fly(){};
}
