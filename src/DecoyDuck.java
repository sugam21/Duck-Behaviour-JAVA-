public class DecoyDuck extends Duck{
    DecoyDuck()
    {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drown();
    }
    public void display(){
        System.out.println("This is DecoyDuck");

    };

}
