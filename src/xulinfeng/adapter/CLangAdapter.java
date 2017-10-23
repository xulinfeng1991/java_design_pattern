package xulinfeng.adapter;

/**
 * 适配器的核心，实现客户端要求的特定接口（IClassFile），
 * 组合自己的新类（CLang），对适配器原有接口方法的调用被委托给新接口的实例的特定方法，cLang.run();
 * Created by xujiahong on 2017/10/13.
 * ======================功能列表======================
 */
public class CLangAdapter implements IClassFile {

    CLang cLang;

    public CLangAdapter(CLang cLang){
        this.cLang=cLang;
    }

    @Override
    public void runOnJVM() {
        cLang.run();
        System.out.println("但是，适配器加了黑科技，现在C可以运行在jvm上了");
    }
}
