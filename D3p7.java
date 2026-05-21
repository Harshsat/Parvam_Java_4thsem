import java.util.Scanner;

public class D3p7{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if(number%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}