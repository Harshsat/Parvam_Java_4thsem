public class D3p2palindrome{
    public static void main(String args[]){
        int n=123;
        int reverse=0;
        int temp=n;
        while(temp>0){
            int remainder=temp%10;
            reverse=(reverse*10)+remainder;
            temp=temp/10;
        }
        if(n==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}