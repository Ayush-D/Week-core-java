package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Demo2 {

    public void fun1(int a){
        if (a % 2 == 0){
            System.out.println(a + " is even");
        }
        else System.out.println(a + " is odd");

        System.out.println();
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = (a) -> {
            System.out.println(a*a);
        };

        consumer.accept(10);
        BiConsumer<Integer, String> biConsumer = (a, b) -> {
            System.out.println(a + " " + b);
        };

        biConsumer.accept(10, "user");

        // List
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);


        // static method
        list.forEach(System.out::println);

        // instance method
        list.forEach(consumer::accept);

        Demo2 demo2 = new Demo2();
        list.forEach(demo2:: fun1);        // instance method

        // For the EMployeeTo class
        List<EmployeeTO> employeeTOS = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            employeeTOS.add(new EmployeeTO(-i, "user" + (5 - i), 20+i));
        }
        employeeTOS.forEach(System.out::println);

        Consumer<EmployeeTO> consumer1 = (a) ->{
            System.out.println(a);
        };
        employeeTOS.forEach(consumer1::accept);

        // sort the basis of user name
        Collections.sort(employeeTOS, (a, b)->(a.getEmpID() - b.getEmpID()));
        employeeTOS.forEach(consumer1::accept);

        List<EmployeeTO> employeeTOS2 = employeeTOS.stream().filter((a) -> (a.getAge() > 22)).collect(Collectors.toList());

        employeeTOS2.forEach(consumer1::accept);

        // total of all ages
        // average of all ages
//        List<EmployeeTO> employeeTOS3 = employeeTOS.stream().map((a) -> (a.getAge()));
        int totalAge = employeeTOS.parallelStream().mapToInt(EmployeeTO::getAge).sum();
        double avg = employeeTOS.parallelStream().mapToDouble(EmployeeTO::getAge).average().orElse(-1);

        System.out.println("Total Ages:" + totalAge);
        System.out.println("Avg Ages: " + avg);
    }
}
