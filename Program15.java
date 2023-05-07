//program to print sum of all even numbers between 1 to n
 import java.util.*;
public class Program15{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int n,sum=1;
    System.out.println("enter a integer");
    n=s.nextInt();
    int count=1;
    int i=2;
    while(count<=n){
      sum=sum+i;
      i=i+2;
      count=count+1;
      System.out.println("sum of even number is "+sum);
     }
   }
} 