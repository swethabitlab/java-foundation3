//program on temparature 
import java.util.*;
public class Program20{
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
      char ch;
    float temp;
    System.out.println("enter a temparature");
    ch=s.next().charAt(0);
    if(ch=='c' || ch=='C'){
      System.out.println("enter a celsius value");
       temp=s.nextFloat();
      System.out.println("fahrenheit value is "+((temp*9)/5)+32);
    }
    else if(ch=='f' || ch=='F'){
       System.out.println("enter a fahrenheit value");
      temp=s.nextFloat();
      System.out.println("fahrenheit value is "+((temp-32)*5)/9);
    }
    else 
      System.out.println("invalid character");
  }
} 