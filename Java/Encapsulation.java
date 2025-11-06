package Java;

//Wrapping data (variables) and methods together into a single unit, and restricting direct access to the data.

public class Encapsulation {
    
    private int balance; //private not accessible from outside //unmutable from outside
    
    public int getBalance(){
        return balance;
    }

    public void setBalance(int value){
        if(value>0){
            balance = value;
            System.out.println("balance is: " + balance);
        }else{
            System.out.println("Invalid entry !!");
        }
    }

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setBalance(1000); 
        en.getBalance(); //balance is: 1000

        en.setBalance(-250); //Invalid entry !!
    }

}
