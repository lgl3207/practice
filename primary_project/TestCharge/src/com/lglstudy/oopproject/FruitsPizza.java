package com.lglstudy.oopproject;

public class FruitsPizza extends Pizza {
    //属性
    private String burdening;//配料水果

    public FruitsPizza() {
    }

    public FruitsPizza(String name, int size, double price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    @Override
    public String showPizza() {
        return "披萨的名字是：" + getName() + "\n披萨的尺寸：" + getSize() + "寸\n披萨的价格：" + getPrice()
                + "\n披萨中加入的水果配料有：" + burdening;
    }
}
