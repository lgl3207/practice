package com.lglstudy.oopproject;

public class BaconPizza extends Pizza {
    //属性
    private int weight;

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, double price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //重写父类的showPizza()方法，方便输出培根披萨的特有信息及基本信息
    @Override
    public String showPizza() {
        return "披萨的名字是：" + getName() + "\n披萨的尺寸：" + getSize() + "寸\n披萨的价格：" + getPrice()
                + "\n披萨的克数：" + weight;
    }
}
