//overriding //run time polymorphism //(INHERITANCE CONCEPT)
//inherited classes are made using extends keyword, to get non private entities of parent. 

package Java;

//******Overriding********: When a subclass provides its own implementation of a method that already exists in its parent class
//*Same method name
//*Same parameters
//*Different implementation

//*********Runtime Polymorphism (Dynamic Method Dispatch)******//It happens when a parent class reference variable refers to a child class object, and the child’s overridden method is called at runtime.

class Animal {
    void sound(){
        System.out.println("Some sound");
    }
}

class Dog extends Animal{
void sound(){ //overriding 
    System.out.println("Barking !");
}
}

public class Overriding{
    public static void main(String[] args) {
        //polymorphism: ref is of animal type but function is of Dog type which is figured at complie time. Initialaly it just checks if the Animal had a sound() 
        Animal ref = new Dog(); 
        ref.sound(); 
    }
}
