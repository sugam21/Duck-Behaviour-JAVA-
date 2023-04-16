public class MallardDuck extends Duck{
    public MallardDuck()
    {flyBehaviour = new FlyWithWings();
    quackBehaviour = new Quack();
    swimBehaviour = new Swim();}
    public void display(){
        System.out.println("This is Mallard Duck");
    }
}
