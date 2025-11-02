package Java;

public class Basics 
{

    public void sayHello(){ //non static method, should be called using obj
        System.out.println("heyyy!!");
    }

    public static void sayBy(){
        System.out.println("bye"); //static method directly called using class name
    }

    public double average(int x, int y){
        double average = (x + y )/2.0;
        return average;
    }

    public static void main(String[]args){ //main method
       Basics ob = new Basics();
       ob.sayHello();  //call using class object

       Basics.sayBy(); //static method call

       System.out.println( ob.average(10, 50)); //average method called and printed

    }
}
