public class RedHeadDuck extends Duck{
    RedHeadDuck()
    {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swim();

    }
    public void display(){
        System.out.println("This is RedHeadDuck");

    };
}
