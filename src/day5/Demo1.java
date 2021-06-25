package day5;

public class Demo1 {

    public static void fun(int x, int y, Calculate calculate){
        System.out.println(calculate.cal(x,y));
    }

    public static void main(String[] args) {
        Calculate calculate = (a,b) -> (a + b);

        System.out.println(calculate.cal(10, 20));

        calculate = (a,b) -> (a + -b);
        System.out.println(calculate.cal(10, 20));
    }
}
