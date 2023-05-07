//program to print sum of all natural numbers between 1 to n
 import java.util.*;
public class Program17{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int n,sum=1;
    System.out.println("enter a integer");
    n=s.nextInt();
    int count=1;
    int i=1;
    while(count<=n){
      sum=sum+i;
      i=i+1;
      count=count+1;
      System.out.println("sum of natural number is "+sum);
     }
   }
} 