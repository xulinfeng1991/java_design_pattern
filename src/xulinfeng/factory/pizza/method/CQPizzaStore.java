package xulinfeng.factory.pizza.method;

import xulinfeng.factory.pizza.CQCheesePizza;
import xulinfeng.factory.pizza.CQSausagePizza;
import xulinfeng.factory.pizza.Pizza;

/**
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public class CQPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new CQCheesePizza();
        }else if("sausage".equals(type)){
            return new CQSausagePizza();
        }else{
            return null;
        }
    }
}
