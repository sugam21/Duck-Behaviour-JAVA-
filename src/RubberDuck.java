public class RubberDuck extends Duck{
    RubberDuck()
    {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
        swimBehaviour = new Float();
    }
    public void display(){
        System.out.println("This is RubberDuck");

    };

}
