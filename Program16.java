//program to print sum of all odd numbers between 1 to n
 import java.util.*;
public class Program16{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int n,sum=1;
    System.out.println("enter a integer");
    n=s.nextInt();
    int count=1;
    int i=1;
    while(count<=n){
      sum=sum+i;
      i=i+2;
      count=count+1;
      System.out.println("sum of odd number is "+sum);
     }
   }
} 