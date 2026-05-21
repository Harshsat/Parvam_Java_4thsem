public class D7p1{
    public static void main(String args[]){
        try{
            String password="cec";
            System.out.println(password.length());
        }
        catch(NullPointerException e){
            System.out.println("password cannot be empty");
        }
        finally{
            System.out.println("login process completed");  
    }
    }
}