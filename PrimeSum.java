import java.util.Scanner;

public class PrimeSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n natural number: ");
        int n=sc.nextInt();
        primeSum(n);
        sc.close();
    }
    public static void primeSum(int n){
        
      int sum=0;
      for(int i=1;i<=n;i++){
         if(i%2!=0){
            sum+=i;
         }
      }
      System.out.println(sum);
    }
}