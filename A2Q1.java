import java.util.*;
import java.lang.*;
import java.io.*;

public class A2Q1 {
    public static void Display(int arr[]) {
        System.out.println("The array is:-");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }
    public static int append(int arr[], int x,int LIF) {
        arr[LIF++] = x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int arr[] = new int[2*n];
        System.out.println("Enter Elements of the array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Display(arr);
        System.out.println("Enter the element to be appended");
        int x = sc.nextInt();
        int LastIndexFilled = n-1;
//        append(arr, x, LastIndexFilled);
        LastIndexFilled++;
        System.out.println("Enter the index and element to be inserted");
        int index = sc.nextInt();
        int element = sc.nextInt();

    }
}
