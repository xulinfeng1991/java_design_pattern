package xulinfeng.factory.mycraft;

/**
 * 抽象工厂模式
 * <p>
 * 用我的世界的工具制作模拟，如果是[纵向]增加材质（比如Gold）则很容易扩展。
 * 新增Gold的相关产品类，新增Gold工厂即可，无需修改原有代码。
 * 但如果是增加一种工具，如锄头，则需要[横向]地改变多个工厂类，较为复杂。
 * 所以，设计抽象工厂模式时，根据业务选取横纵向才是精髓
 * </p>
 * Created by xujiahong on 2017/9/28.
 * ======================功能列表======================
 */
public class Client {

    public static void main(String[] args) {
        StoneFactory stoneFactory = new StoneFactory();
        IronFactory ironFactory = new IronFactory();
        Tool tool1 = stoneFactory.createAxe();
        Tool tool2 = ironFactory.createSword();
        System.out.println(tool1.getClass());
        System.out.println(tool2.getClass());
        /*
        class xulinfeng.factory.mycraft.StoneAxe
        class xulinfeng.factory.mycraft.IronSword
         */
    }

}
