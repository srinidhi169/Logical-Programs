//write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)
import java.util.Scanner;

class Mobile{
  public void method(){ 
    long num,max,min;
    max=9999999999L;
    min=1000000000;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the mobile number");
    num=sc.nextLong();
    if(num>=min && num<=max)
      System.out.println("The given "+num+" is valid ");
    
    else
      System.out.println("The given "+num+" is not valid ");
 }
}

public class MobileNum{
  public static void main(String[] args)
  {
    Mobile c= new Mobile();
    c.method();
  }
}

