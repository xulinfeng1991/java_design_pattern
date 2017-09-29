package xulinfeng.factory.mycraft;

/**
 * Created by xujiahong on 2017/9/28.
 * ======================功能列表======================
 */
public class IronFactory extends ToolFactory {
    @Override
    public Axe createAxe() {
        return new IronAxe();
    }

    @Override
    public Sword createSword() {
        return new IronSword();
    }

    @Override
    public Pick createPick() {
        return new IronPick();
    }
}
