class Swap{
    public static void main(String[] args) {
        int a=4;
        int b=3;
        System.out.println("Before swap a =" + a);
        System.out.println("Before swap b = " + b);
        a=a+b;
        b = a-b;
        a=a-b;
        System.out.println("Afrer swap a="+a);
        System.out.println("After swap b = " + b);       
    }
}