//program to check whether the given character is digit or not
import java.util.*;
public class Program10{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    char ch;
    System.out.println("enter a character");
    ch=s.next().charAt(0);
    if(ch>='0' && ch<='9')
      System.out.println("entered character is a digit");
    else
     System.out.println("entered character is not a digit");
    System.out.println("end");
  }
}