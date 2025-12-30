package com.lglstudy.oopproject;

import java.util.Scanner;

public class PizzaStore {

    public static Pizza getPizza(int choose) {
        Pizza pizza = null;
        Scanner scanner = new Scanner(System.in);
        switch (choose) {
            case 1:
                System.out.println("请录入培根的数量：");
                int weight = scanner.nextInt();
                System.out.println("请录入披萨的大小：");
                int size = scanner.nextInt();
                System.out.println("请录入披萨店价格：");
                double price = scanner.nextDouble();
                //将录入的信息封装为BaconPizza对象
                BaconPizza baconPizza = new BaconPizza("培根披萨", size, price, weight);
                pizza = baconPizza;
                break;
            case 2:
                System.out.println("请输入你想要加入的水果：");
                String burdening = scanner.next();
                System.out.println("请录入披萨的大小：");
                int measure = scanner.nextInt();
                System.out.println("请录入披萨店价格：");
                double cost = scanner.nextDouble();
                //将录入的信息封装为水果披萨对象
                FruitsPizza fruitsPizza = new FruitsPizza("水果披萨", measure, cost, burdening);
                pizza = fruitsPizza;
                break;
            default:
                System.out.println("抱歉，没有你想要的披萨...");
                break;
        }
        return pizza;
    }
}
