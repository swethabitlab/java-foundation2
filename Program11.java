//program to print sum of digits of a number
import java.util.*;
public class Program11{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n,sum=0,digit;
    System.out.println("enter a integer");
    n=s.nextInt();
    while(n>0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
    System.out.println("sum of digits is "+sum);
  }
}