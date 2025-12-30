package com.lglstudy.oopproject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            //选择购买披萨
            System.out.println("请选择你想要购买的披萨(1.培根披萨 2.水果披萨)：");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            Pizza pizza = PizzaStore.getPizza(choose);
            System.out.println(pizza.showPizza());
        }
    }
}
