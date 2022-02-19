// Generates fibonacci series
import java.util.Scanner;

public class Fibonacci {
    public static void print(int num){
        // if(num == 1){ // Base condition
        //     System.out.println(first);
        // }
        // System.out.print(first + "  ");
        // print(second, first + second, num-1);
        int num1 = 0, num2 = 1;
        System.out.println("The Fibonacci series is >> ");
        for(int i = 0; i<num; i++){
            System.out.print(num1 + "  ");
            int temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the num of terms>> ");
        a = sc.nextInt();
        print(a);
    }
}
