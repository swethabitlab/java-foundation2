//program to print all natural numbers from 1 to n
import java.util.*;
public class Program12{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a integer");
    n=s.nextInt();
    int i=1;
    while(i<=n){
      System.out.println(i);
      i=i+1;
    }
      
  }
}