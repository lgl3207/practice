package com.lglstudy.doublecolorball;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        int[] myNums = new int[7];//记录红蓝球的号码
        int notes = 0;//购买注数
        boolean isBuy = false;//判断用户是否购买彩票
        while (true) {
            System.out.println("--------欢迎进入双色球彩票系统---------");
            System.out.println("\t\t1.购买彩票");
            System.out.println("\t\t2.查看开奖");
            System.out.println("\t\t3.退出");
            System.out.print("请选择菜单: ");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();//选择功能
            switch (select) {
                case 1:
                    System.out.println("双色球彩票系统----> 购买彩票");
                    System.out.print("您需要下多少注：");
                    notes = scanner.nextInt();
                    for (int i = 1; i <= 7; i++) {
                        //将6个红球的号码记入数组中
                        if (i != 7) {
                            System.out.println("请选择6个红球，第" + i + "个红球为：红球在(1-33)之间");
                            int redBall = scanner.nextInt();
                            myNums[i - 1] = redBall;
                        } else {
                            //将1个蓝球的号码记入数组
                            System.out.println("请选择1个蓝球，蓝球为：蓝球在(1-16)之间");
                            int blueBall = scanner.nextInt();
                            myNums[6] = blueBall;
                        }
                    }
                    String details = "您一个共买了 【" + notes + "】 注，" + "一共花费" + (notes * 2) + "元钱，所选号码为：";
                    System.out.println(details);
                    for (int i : myNums) {
                        System.out.print(i + "\t");
                    }
                    //换行
                    System.out.println();
                    isBuy = true;
                    break;
                case 2:
                    if (isBuy) {
                        System.out.println("双色球彩票系统----> 查看开奖");
                        //1.购买号码

                        //2.中奖号码
                        int[] luckBall = getLuckBall();
                        System.out.print("中将号码为：" + Arrays.toString(luckBall));
                        System.out.println();
                        //3.将两组号码进行比对
                        int level = getLevel(myNums, luckBall);
                        //4.根据level的结果执行后面的逻辑：
                        switch (level) {
                            case 1:
                                System.out.println("恭喜你，中了1等奖，1注奖金500万，您一共获得：" + (500 * notes) + "万元");
                                break;
                            case 2:
                                System.out.println("恭喜你，中了2等奖，1注奖金100万，您一共获得：" + (100 * notes) + "万元");
                                break;
                            case 3:
                                System.out.println("恭喜你，中了3等奖，1注奖金30万，您一共获得：" + (30 * notes) + "万元");
                                break;
                            case 4:
                                System.out.println("恭喜你，中了4等奖，1注奖金5万，您一共获得：" + (5 * notes) + "万元");
                                break;
                            case 5:
                                System.out.println("恭喜你，中了5等奖，1注奖金2000元，您一共获得：" + (2000 * notes) + "元");
                                break;
                            case 6:
                                System.out.println("恭喜你，中了6等奖，1注奖金5元，您一共获得：" + (5 * notes) + "元");
                                break;
                            default:
                                System.out.println("感谢参与！");
                        }
                    } else {
                        System.out.println("对不起，请先购买彩票...");
                    }
                    break;
                case 3:
                    System.out.println("双色球彩票系统----> 退出");
                    System.out.println("系统已退出...");
                    return;
            }
        }
    }

    //定义一个方法，专门用来生成中奖号码
    public static int[] getLuckBall() {
        int[] luckyNums = new int[7];
        for (int i = 0; i < 7; i++) {
            //随机幸运号码，将6个红球的号码存入luckNums数组
            if (i != 6) {
                int randomNum = (int) (Math.random() * 33 + 1);
                luckyNums[i] = randomNum;
            } else {
                // 将1个蓝球的号码存入luckNums数组
                int randomNum = (int) (Math.random() * 16 + 1);
                luckyNums[6] = randomNum;
            }
        }
        return luckyNums;
    }

    //定义一个方法，用来比对 购买号码和中奖号码的
    public static int getLevel(int[] myBalls, int[] luckyBalls) {
        int level = 0;//记录几等奖
        int redTotal = 0;
        int blueCount = 0;
        for (int i = 0; i < 7; i++) {
            if (i != 6) {//i：0-5 红球 比对红球
                for (int j = 0; j <= 5; j++) {
                    if (myBalls[i] == luckyBalls[j]) {
                        redTotal++;
                    }
                }
            } else {
                if (myBalls[6] == luckyBalls[6]) {
                    blueCount++;
                }
            }
        }
        //输出比对结果
        System.out.println("红球有" + redTotal + "个相等");
        System.out.println("蓝球有" + blueCount + "个相等");

        //根据红球和蓝球的相等数量得到level的具体结果
        if (redTotal == 6 && blueCount == 1) {
            level = 1;
        } else if (redTotal == 6 && blueCount == 0) {
            level = 2;
        } else if (redTotal == 5 && blueCount == 1) {
            level = 3;
        } else if (redTotal == 5 || redTotal == 4 && blueCount == 1) {
            level = 4;
        } else if (redTotal == 4 || redTotal == 3 && blueCount == 1) {
            level = 5;
        } else if (redTotal < 4 && blueCount == 1) {
            level = 6;
        }
        return level;
    }
}
