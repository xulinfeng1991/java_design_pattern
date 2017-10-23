package xulinfeng.singleton;

/**
 * 推荐使用的，最简单的单例实现
 * Created by xujiahong on 2017/9/29.
 * ======================功能列表======================
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public Singleton getInstance(){
        return instance;
    }
}
