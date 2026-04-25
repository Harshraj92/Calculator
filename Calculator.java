import java.util.*;
class Calc{
    void cube(int n){
        System.out.println("Cube of " + n + (n*n*n));
    }
    void Factorial(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
            fact=fact*n;

        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

 public class Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st number : ");
        int a = sc.nextInt();
        System.out.print("2nd number : ");
        int b = sc.nextInt();
        System.out.println("Addition : " + (a+b));
        System.out.println("Substraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Scientific Calculator");
        double Square=Math.sqrt(a);
        System.out.println("Square root of " + a + " : " + Square);
        double Power = Math.pow(a,b);
        System.out.println(b+ " to the power " + a + " : " + Power);
        Calc obj = new Calc();
        obj.Factorial(b);
        obj.cube(a);

        sc.close();
    }
 }