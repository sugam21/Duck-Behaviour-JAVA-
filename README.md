# Duck-Behaviour-JAVA-
This repo will implement the class diagram shown here : https://www.oreilly.com/api/v2/epubs/0596007124/files/figs/web/022fig01.png.jpg

------------------------------------------------------------
This project contains 3 interfaces 
1. FlyBehaviour --> contains abstract method fly
2. QuackBehaviour --> contains abstract method quack
3. SwimBehaviour --> contains abstract method swim
and a Class Duck which contains features of duck.
------------------------------------------------------
A. FlyWithWings and FlyNoWay are the classes which implements FlyBehaviour class and override the fly() method.
B. Quack , Squeak and MuteQuack are the classes which implements QuackBehaviour and override the quack() method.
C. Swim, Drown and Float are the classes which implements SwimBehaviour and override the swim() method. 
D. MallardDuck, ReadheadDuck, RubberDuck and DecoyDuck are the classes which extends the Duck class and overrides display() method to display what kind of duck it is.

Duck class contains functions like:
1. swim()
2. display() ---> Displays what duck it is.
3. performQuack() --> What sound it makes.
4. performSwim() --> Does it swim or not ?
5. perfomrFly() --> Does it fly or not ?
6. setFlyBehaviour() --> It takes fly behaviour as input and sets the fly behaviour.
7. setQuackBehaviour() --> It takes quack behaviour as input and sets the quack behaviour.
8. setSwimBehaviour() --> It takes swim behaviour as input and sets the swim behaviour.
--------------------------------------------------------
Main Class Links every single class and displays the properties of the ducks.
