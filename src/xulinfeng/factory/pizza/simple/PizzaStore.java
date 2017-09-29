package xulinfeng.factory.pizza.simple;

import xulinfeng.factory.pizza.Pizza;

/**
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public class PizzaStore {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        System.out.println(pizza.getClass());
        pizza.prepare();
        pizza.box();
    }

}
