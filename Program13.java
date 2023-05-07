//program to print all natural numbers in reverse
 import java.util.*;
public class Program13{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a integer");
    n=s.nextInt();
    int i=n;
    while(i>=1){
        System.out.println(i);
        i=i-1;
      }
   }
}
  