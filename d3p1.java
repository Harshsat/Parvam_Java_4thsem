/*class Atm{
    private int balance=5000;
    //setter method
    public void deposit(int amount){
        balance=balance+amount;
    }
    //getter method
    public int getBalance(){
        return balance;
    }
}

public class d3p1{
    public static void main(String args[]){
        Atm obj=new Atm();
        obj.deposit(5000);
        System.out.println("Balance is:"+obj.getBalance());
    }
}*/

//encapsulation with validation

class Atm{
    private int balance=5000;
    //setter method
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited successfully");
        }
        else{
            System.out.println("invalid amount");
        }
    }
    //getter method
    public int getBalance(){
        return balance;
    }
}

public class d3p1{
    public static void main(String args[]){
        Atm obj=new Atm();
        obj.deposit(-1);
        System.out.println("Balance is:"+obj.getBalance());
    }
}