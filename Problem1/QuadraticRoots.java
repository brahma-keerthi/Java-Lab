// Roots of quadratic equation
import java.util.Scanner;

class Roots{
    private int a, b, c;
    private double r1, r2, det;
    Roots(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getRoots(){
        det = b*b - 4*a*c;
        if(det >= 0){
            r1 = (-b + Math.pow(det, 0.5))/(2.0*a);
            r2 = (-b - Math.pow(det, 0.5))/(2.0*a);
            System.out.println("The roots are >> " + r1 + " and " + r2);
            return;
        }
        System.out.println("No Real Roots");
    }
}

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the co-efficients in order of decreasing power of x >> ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    
        Roots r = new Roots(a, b, c);
        r.getRoots();
    }
}