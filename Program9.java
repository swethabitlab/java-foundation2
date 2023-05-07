//program to print opposite of boolen values(if read true print false)
import java.util.*;
public class Program9{
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  boolean b;
  System.out.println("enter a boolean value");
  b=s.nextBoolean();
  if(b==true)
    System.out.println("false");
  else
    System.out.println("true");
  System.out.println("end");
  }
}  