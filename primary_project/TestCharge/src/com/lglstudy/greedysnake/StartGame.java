package com.lglstudy.greedysnake;

import javax.swing.*;
import java.awt.*;

public class StartGame {
    public static void main(String[] args) {
        //创建一个窗体
        JFrame jFrame = new JFrame();
        //给窗体设置一个标题
        jFrame.setTitle("经典贪吃蛇小游戏 by lgl");
        //设置窗体弹出的坐标，及对应窗体的宽高
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jFrame.setBounds((width - 800) / 2, (height - 800) / 2, 800, 800);
        //设置窗体大小不可调节
        jFrame.setResizable(false);
        //关闭窗口的同时，程序也随之关闭
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //创建面板：
        GamePanel gamePanel = new GamePanel();
        //将画板放入窗体
        jFrame.add(gamePanel);
        //默认情况下窗体是隐蔽效果，必须将窗体进行显现: 细节 --> 这个显现方法最好放在最后
        jFrame.setVisible(true);
    }
}
