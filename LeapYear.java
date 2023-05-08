//program to check whether a year is loop year or not
import java.util.*;
public class LeapYear{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int year;
    System.out.println("enter a year");
    year=s.nextInt();
    if((year%4==0 && year%100!=0) || year%400==0)
      System.out.println("leap year");
    else 
      System.out.println("not a leap year");
  }
} 
                        