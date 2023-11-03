//write a java program to find the duplicate elements in an array


/*PseudoCode for duplicate elements in an array
step 1:Start
Step 2:take the array size by the user
Step 3:create an array and enter the elements in to array for size n values by using for loop.
Step 4:Initailize the count=0;
Step 5:print the original array using for loop. 
        
Step 6:Then iterate using for loop from i and i+1
           if(num[i]==num[j])
Step 7:check for the condition if it is true
          print that element.
      increment the count value.
Step 8:Then check the count value 
       if(count==0)
        print no duplicate values

Step 9:stop*/

import java.util.Scanner;
public class Duplicate{
  public static void main(String[] args) {
    All sn = new All();
    sn.array();
  }
}

class All {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int num[]=new int[n];
    int count=0;
    System.out.println("enter the elements of array");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.print("the array is");
    for(int i=0;i<n;i++){
     System.out.println(num[i]+",");
    }
    System.out.println("the duplicate elements are");
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
      if(num[i]==num[j]){
          System.out.println(num[j]);
          count++;
      }
      }
    }
    
    if(count==0){
     System.out.println("no duplicate elements in the array");
    }
  }
}












