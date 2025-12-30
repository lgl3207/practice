package com.lglstudy.oopproject;

public class Pizza {
    //属性
    private String name;//名字
    private int size;//大小
    private double price;//价格

    public Pizza() {
    }

    public Pizza(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //展示披萨信息
    public String showPizza() {
        return "披萨名字:" + name + "，披萨大小:" + size + "，披萨价格:" + price;
    }
}
