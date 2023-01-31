import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divisor and dividend: ");
        int divisor=sc.nextInt();
        int dividend=sc.nextInt();
        findGCD(divisor,dividend);
        sc.close();
    }
    public static void findGCD(int divisor,int dividend){
        
        int ans=0;
        int a=divisor,b=dividend;
        while(dividend%divisor!=0){
            ans=dividend%divisor;
            dividend=divisor;
            divisor=ans;
        }
        System.out.println("The GCD of "+a+" and "+b+" is "+divisor);
    }
}
