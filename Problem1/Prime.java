// Generates Prime numbers in a given range
import java.util.Scanner;

class PrimeNum{
    private int n, m, flag;
    PrimeNum(int num1, int num2){
        this.n = num1;
        this.m = num2;
    }

    void printPrime(){
        System.out.println("The Prime numbers from range " + n + " to " + m + " is>>");
        for(int i = n; i<=m; i++){
            flag = 0;
            for(int j = 2; j<=Math.pow(i, 0.5); j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.print(i+"   ");
            }
        }
    }

}

class Prime{
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range>> ");
        AGAIN:
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            while (a>b){
                System.out.println("Enter the range correctly>> ");
                a = sc.nextInt();
                b = sc.nextInt();
            }
        }
        PrimeNum pn = new PrimeNum(a+1, b-1);
        pn.printPrime();
    }
}