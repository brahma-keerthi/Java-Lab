import java.util.Scanner;

public class Pattern {
    static void print(int n){
        for(int i = 1; i<=n; i++){
            for(int j = i; j<=n-1; j++){ // Print blank spaces
                System.out.print(" ");
            }
            for(int x = 1; x<=(2*i-1); x++){  // Print stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number of lines>> ");
        a = sc.nextInt();
        print(a);
    }
}
