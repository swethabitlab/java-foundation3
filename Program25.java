//Write a program that takes in two integers as input and outputs their sum if both the integers are even. If both integers are odd, output their product. If one of the integers is odd and the other is even, output their difference
import java.util.Scanner;
public class Program25{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a,b;
    System.out.println("enter two values");
    a=s.nextInt();
    b=s.nextInt();
    if(a%2==0 && b%2==0)
       System.out.println("sum of even numers is "+ a+b);
    else if(a%2!=0 && b%2!=0)
      System.out.println("product of odd numbers is "+ a*b);
    else
      System.out.println("the difference is "+ (a-b));
  }
}