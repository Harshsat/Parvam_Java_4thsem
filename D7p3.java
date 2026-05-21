class LowBalanceException extends Exception{
    LowBalanceException(String message){
        super(message);
    }
}

public class D7p3{
    public static void main(String args[]){
        int balance=5000;
        try{
            if(balance<1000){
                throw new LowBalanceException("Balance is less than 1000");
            }
        System.out.println("Transaction successfull");
        }
        catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}