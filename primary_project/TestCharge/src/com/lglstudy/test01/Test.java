package com.lglstudy.test01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //定义一个字符串用来接收整个收入明细
        String details = "";
        //定义一个整数来记录账户余额
        int balance = 0;//初始化金额为0
        while (true) {
            System.out.println("--------欢迎使用记账系统--------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退    出");
            System.out.println("请输入你要选择的功能: ");
            //拿来一个扫描器
            Scanner scanner = new Scanner(System.in);
            //接收键盘录入的int类型的数据
            int choice = scanner.nextInt();
            //对你录入的choice做一个过滤
            System.out.println(choice);
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                System.out.println("对不起，你录入的功能不存在，请重新录入: ");
                int newChoice = scanner.nextInt();
                choice = newChoice;
            }
            //根据你录入的数字，判断执行对应的功能
            switch (choice) {
                case 1:
                    System.out.println("记账系统 ----> 收支明细");
                    System.out.print(details);
                    /*if (details != "") {
                        System.out.println(details.substring(0, details.length() - 1));
                    } else {
                        System.out.print(details);
                    }*/
                    break;
                case 2:
                    System.out.println("记账系统 ----> 登记收入");
                    System.out.println("请输入你收入的金额：");
                    int income = scanner.nextInt();
                    System.out.println("收入说明：");
                    String describe = scanner.next();
                    balance += income;
                    details += "收入金额：" + income + "，收入来源：" + describe + "，账户余额：" + balance + "\n";
                    System.out.print(details);
                    break;
                case 3:
                    System.out.println("记账系统 ----> 收支支出");
                    System.out.println("请输入你支出的金额：");
                    int pay = scanner.nextInt();
                    System.out.println("支出说明：");
                    String payDescribe = scanner.next();
                    balance -= pay;
                    if (balance > pay) {
                        details += "支出金额：" + pay + "，支出说明：" + payDescribe + "，账户余额：" + balance + "\n";
                        System.out.print(details);
                    } else {
                        System.out.println("支付失败，当前余额为：" + (balance += pay));
                    }

                    break;
                case 4:
                    System.out.println("记账系统 ----> 退出功能");
                    System.out.println("你确定要退出吗？(y/n)");
                    String exit = scanner.next();
                    if ("y".equals(exit)) {
                        System.out.println("系统已退出...");
                        return;
                    }

                    /*switch (exit) {
                        case "y":
                            System.out.println("感谢你的使用，系统已退出...");
                            return;
                    }*/
            }
        }
    }
}
