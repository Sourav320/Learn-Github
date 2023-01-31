import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for multiplication: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication of two numbers is "+a*b);
        sc.close();
    }
}
