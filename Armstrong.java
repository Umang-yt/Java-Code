
import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit number to be checked :");
        int num =sc.nextInt();
        int n = num;
        int check = 0,remainder;
        do {
            remainder = n % 10;
            check = check +(int) Math.pow(remainder,3);
            n=n/10;
        }while(n !=0);
        
        if(check==num)   //if sum of cubes is equal to number 
              System.out.println(num+" is an Armstrong Number");
        else
            System.out.println(num+ " is not a Armstrong Number");
        }
    }
    
