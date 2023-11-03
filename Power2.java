import java.util.Scanner;
 
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input");
            return;
        }
        if ((num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2");
        } else {
            System.out.println(num + " is not a power of 2");
        }
    }
 }