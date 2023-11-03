//write an array to dispaly prime numbers in that array
import java.util.Scanner;

public class Prime{
  public static void main(String[] args){
    All s= new All();
    s.allPrime();
  }
}
class All{
  public void allPrime(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    int num2[]=new int[n];
    System.out.println("enter the values of an array:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("the array is:");
    for(int i=0;i<n;i++){
      System.out.println(num[i]);
    }
    for(int i=0;i<n;i++){
      if(num[i]<=1)
          count++;
      else{
        for(int j=2;j<n;j++){
          if(num[j]%2==0)
           count++;
        }
       System.out.println(num[i]);
      }
    }
  }
}
  