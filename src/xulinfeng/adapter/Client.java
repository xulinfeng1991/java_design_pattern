package xulinfeng.adapter;

/**
 * Created by xujiahong on 2017/10/13.
 * ======================功能列表======================
 */
public class Client {
    public static void main(String[] args) {
        runOnJVM(new JavaLang());
//        runOnJVM(new CLang());//报错
        runOnJVM(new CLangAdapter(new CLang()));

    }

    public static void runOnJVM(IClassFile classFile){
        classFile.runOnJVM();
    }
}
