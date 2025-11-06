package Java;
// /When multiple methods in the same class have the same name but different parameters, it’s called overloading.

public class Overloading {

    void add(int x, int y) { 
        System.out.println(x + y);
    }

    void add(double x, double y) { //overloaded method
        System.out.println(x + y);
    }

    void add(int a, int b, int c) { //overloaded method
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Overloading ov = new Overloading();
        ov.add(3,6); //9
        ov.add(2.6, 7.9); //10.5
        ov.add(3,7,8); //18
    }
}


