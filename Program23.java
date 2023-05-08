//Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Program23{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String birthdate;
    System.out.println("enter birthdate as YYY-MM-DD");
    birthdate=s.nextLine();
    LocalDate birthDate=LocalDate.parse(birthdate);
    LocalDate currentDate=LocalDate.now();
    Period age=Period.between(birthDate,currentDate);
    System.out.println("your age is "+ age.getYears() +" Years " + age.getMonths() +" Months " + age.getDays() +" Days "); // print age
    //check minor or adult
    int ageInYears=age.getYears();
    if(ageInYears<18)
      System.out.println("minor");
    else
      System.out.println("adult");
  }
}