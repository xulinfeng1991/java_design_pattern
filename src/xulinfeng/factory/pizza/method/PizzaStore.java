package xulinfeng.factory.pizza.method;

import xulinfeng.factory.pizza.Pizza;

/**
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public abstract class PizzaStore {

    /**
     * 此方法，即工厂方法
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);

    void orderPizza(String type){
        Pizza pizza = this.createPizza(type);
        System.out.println(pizza.getClass());
        pizza.prepare();
        pizza.box();
    }
}
