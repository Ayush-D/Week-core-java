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

// Throwable is a super class of all the exceptions:
//1. Exception: -> Super class of all the exceptions
//        Sub Class: (File not found, Error exception, SQL exceptions)
//2. Errors (Unchecked)
//        index out of bound,divisions by 0.
//
//3.
//Handelling:
//1. Should be specific
//2. should be handeled centralised (only one place to handel the errors
//        like main)
//3. by keywords: try, catch, throws, finally
//
//types of exceptions:
//1. System defined exceptions: automattically called, no need to throw.class
//2. User defined: User can create own errors
