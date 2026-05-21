public class D7p2{
    public static void main(String args[]){
        try{
            int number=10/2;
            System.out.println(number);
        }
        catch(ArithmeticException e){
            System.out.println("number is not divisible by zero");
        }
        finally{
            System.out.println("program completed");
        }
    }
}