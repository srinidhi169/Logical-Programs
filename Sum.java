import java.util.Scanner;
public class Sum{
  public static void main(String[] args){
  Addition a=new Addition();
  a.sum();
  }
}

class Addition{
  public void sum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();//5
    int num[]=new int[n];
    System.out.println("enter the elements of an array");
    for(int i=0;i<n;i++){ //element-index
      num[i]=sc.nextInt();//1-0
                          //2-1
                          //3-2
                          //4-3
                          //5-4
    }
    int sum=0;
    int avg=0;
    for(int i=0;i<n;i++){ //i=0;i<5;i++      //i=1;1<5;
                          //sum=sum+num[0];  //sum=1+num[1];
                          //sum=0+1=1        //sum=1+2=3
      sum=sum+num[i];
    }
    avg=sum/n;
    System.out.println("the total sum is:"+sum);
    System.out.println("the avrage is:"+avg);
  }
}