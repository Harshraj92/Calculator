import java.util.*;
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
        sc.close();
    }
 }