package xulinfeng.factory.mycraft;

/**
 * Created by xujiahong on 2017/9/28.
 * ======================功能列表======================
 */
public abstract class Tool {

    protected String name;
    protected String material;

    protected void printInfo(){
        System.out.println(this.material+this.name);
    }

//    /**
//     * 每个产品特有的方法
//     */
//    abstract void printX();

}
