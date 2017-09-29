package xulinfeng.factory.pizza.simple;

import xulinfeng.factory.pizza.Pizza;

/**
 * 简单工厂：封装对象创建的细节
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if("cheese".equals(type)){
            return new CheesePizza();
        }else if("sausage".equals(type)){
            return new SausagePizza();
        }else if("veggie".equals(type)){
            return new VeggiePizza();
        }else{
            return null;
        }
    }
}
