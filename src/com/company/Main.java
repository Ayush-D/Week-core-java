package com.company;

import java.util.*;

public class Main {
    public static void addTwoNumbers(){
//        Scanner scanner = new Scanner(System.in);
        int num1 = Read.scanner.nextInt();
        int num2 = Read.scanner.nextInt();

//        int num1 = Read.nextInt();
//        int num2 = Read.nextInt();

        System.out.println(num1 + num2);
//        scanner.close();
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Java Project");
//        Main object = new Main();
//
//        Main.addTwoNumbers();


        List<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(5);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------------");

        Collections.sort(list);

        System.out.println(list);
        System.out.println("------------");

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("------Remove-------");

        list.remove(Integer.valueOf(20));

        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(10);

    }
}
