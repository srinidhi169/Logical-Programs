//write a java program to print all strong numbers from 1 to n where n is an integer 
import java.util.Scanner;
public class AllStrong{
  public static void main(String[] args){
    StrongOr_Not son = new StrongOr_Not();
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter n value");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
      boolean b = son.isStrong(i);
      if(b)
        System.out.println(i);
    }
  }
}
  

  class StrongOr_Not{
    public boolean isStrong(int num){
      int digit,sum=0;
      int dup_num=num;
    while(num!=0)
      {
        digit = num%10;
        int j=1,factorial=1;
        while(j<=digit)
          {
            factorial = factorial*j;
            j++;
          }
        sum = sum+factorial;
        num = num/10;
      }
      if(sum==dup_num)
        return true;
      else
        return false;
          
    }
  }