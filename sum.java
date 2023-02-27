import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        int sum=0, a=0,b=0;
        Scanner scan = new Scanner(System.in);
        
        //input the first variable
        System.out.println("Enter the first number");
        a = scan.nextInt();
        
        //input the second variable
        System.out.println("Enter the second number");
        b = scan.nextInt();

        //add the two numbers 
        sum = a +b ;

        //result of the two numbers
        System.out.println("The sum of the two numbers is "+ sum);
        
    }
}