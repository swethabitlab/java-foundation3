//Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program
import java.lang.Math;
import java.util.*;
public class Program24{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    double n;
    System.out.println("enter a value");
    n=s.nextDouble();
    double sq=Math.sqrt(n);
    if(sq==(int)sq)
    System.out.println("perfect square");
    else
      System.out.println("not a perfect square");
  }
}