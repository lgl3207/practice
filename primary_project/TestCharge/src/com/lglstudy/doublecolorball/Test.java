package com.lglstudy.doublecolorball;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(10));//[0, 1)
        /*for (int i = 0; i < 10; i++) {
            System.out.print((int) (Math.random() * 16 + 1) + "\t");//[0, 16]
        }*/
       /* int[] arr1 = {12, 32, 43, 44, 51, 6, 13};
        int[] arr2 = {44, 44, 32, 43, 44, 16, 13};
        int level = DoubleColorBall.getLevel(arr1, arr2);
        System.out.println(level);*/
    }
}
