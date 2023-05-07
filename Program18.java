//program to print all even numbers from 1 to 100
 import java.util.*;
public class Program18{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a integer");
    n=s.nextInt();
    int i=2;
    while(i<=100){
      System.out.println(i);
      i=i+2;
    }
    System.out.println("end");
  }
} 