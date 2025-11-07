package Java;

//Lambdas are short functions without names — used mainly to simplify code when working with functional interfaces (interfaces with one abstract method).

//its like creating object of the interface and defing the abstract method in a single line 
//syntax::  (parameters) -> { expression or statements }

//its just a new way of writing

interface saySomething {
    void say(String msg);
}

interface add {
    int adding(int a, int b);
}

public class Lambdas {
    public static void main(String[] args) {

        // definition of the abstract method using lambda expression
        saySomething ss = (msg) -> System.out.println("Message" + msg);
        //usage
        ss.say("Hi Jatin !"); //MessageHi Jatin !
        

        //with a return value
        add ad = (a, b) -> a+b;
        //usage
        System.out.println(ad.adding(10, 20)); //30
    }
}
