package day5;

public class ExceptionDemo {

    public static void f1(int a, int b) throws ArithmeticException{
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("program begins: ");
        int a, b, c;
        a = 10;
        b = 0;
        try {
            f1(a, b);
        }
        catch (ArithmeticException e){
            System.out.println("goes here");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
//        System.out.println(c);
        System.out.println("Programs end");
    }
}