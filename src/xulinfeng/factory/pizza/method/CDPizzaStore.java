package xulinfeng.factory.pizza.method;

import xulinfeng.factory.pizza.CDCheesePizza;
import xulinfeng.factory.pizza.CDSausagePizza;
import xulinfeng.factory.pizza.Pizza;

/**
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public class CDPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new CDCheesePizza();
        }else if("sausage".equals(type)){
            return new CDSausagePizza();
        }else{
            return null;
        }
    }
}
