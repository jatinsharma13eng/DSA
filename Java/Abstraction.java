package Java;

//Abstraction means hiding implementation details and showing only the essential features.
//can be done using Abstract classes and Interfaces. 
//In case of abstract classes, Abstract methods are implemented by subclasses.
//object cannot be there for a abstract class or interfaces. 

//Interface is 100% abstraction as it only has abstract methods, and final varibales


abstract class Animal { // abstract class
    void sleeping() { // non abstract method
        System.out.println("Sleeping !!");
    }
    abstract void bark(); // abstract method has no definition, we only know that it exists
}

class Dog extends Animal { // must implement bark()
    void bark() {
        System.out.println("bhow bhow !!");
    }
}

interface Human{ //all abstract methods only 
 void speak();  //by default public and abstract 
}

class Jatin implements Human{ //must implement speak()
public void speak(){
System.out.println("Jatin speaks Hindi");
}
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sleeping(); //sleeping !!
        dg.bark(); //bhow bhow !!

        Human hm = new Jatin();
        hm.speak(); //Jatin speaks Hindi

        //here Human hm = new Jatin() is done because type remains of the interface only and can be later easily updated to something else like : 
        // hm = new Abhishek(); and so on.. 
        //so this is a kind of polymorphism where one interface serves many definitions. 
    }

}
