package xulinfeng.factory.mycraft;

/**
 * Created by xujiahong on 2017/9/28.
 * ======================功能列表======================
 */
public class StoneFactory extends ToolFactory {
    @Override
    public Axe createAxe() {
        return new StoneAxe();
    }

    @Override
    public Sword createSword() {
        return new StoneSword();
    }

    @Override
    public Pick createPick() {
        return new StonePick();
    }
}
