import java.util.*;
import java.lang.*;
import java.io.*;
class questiontwoo{
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial, we want to find");
        int number=sc.nextInt();//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}