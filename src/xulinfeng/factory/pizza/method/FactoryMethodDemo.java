package xulinfeng.factory.pizza.method;

/**
 * 工厂方法模式
 * <p>工厂是抽象类，产品也是抽象类</p>
 * Created by xujiahong on 2017/9/27.
 * ======================功能列表======================
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        PizzaStore store = new CDPizzaStore();
        store.orderPizza("cheese");
    }
}
