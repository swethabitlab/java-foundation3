// program for Given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)
import java.util.*;
public class Program21{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
    int low,high,count;
    System.out.println("enter two values");
    low=s.nextInt();
    high=s.nextInt();
    if(low%2!=0){
      low++;
    }
    else if(high%2!=0){
      high--; 
    }
    count=((high-low)/2)+1;
    System.out.println("the count of odd numbers is "+count);
  }
} 