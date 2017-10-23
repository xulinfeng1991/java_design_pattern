package xulinfeng.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by xujiahong on 2017/10/10.
 * ======================功能列表======================
 */
public class PrototypeClient {
    public static void main(String[] args) {
        List<Gift> giftList = new ArrayList();
//        initList(giftList);
        initCloneList(giftList);
        for(int i=0;i<giftList.size();i++){
            System.out.println(giftList.get(i));
        }
    }

    private static void initList(List<Gift> giftList){
        for(int i=0;i<100;i++){
            Gift gift = new Gift();
            gift.setNum(getRandStr(8));
            gift.setCount(i+200);
            giftList.add(gift);
        }
    }

    /*
    调用Object类的clone方法时，8种基本类型及其包装类可以看着深拷贝，
    由于String类型的不可变性质，虽然是浅拷贝，也可以看作独立副本正常使用。
    对于数组、容器对象、引用对象等都是浅拷贝，需要注意赋值操作。
    如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
     */
    private static void initCloneList(List<Gift> giftList){
        Gift g = new Gift();
        for(int i=0;i<100;i++){
            Gift gift = g.clone();
            if(i>=90){
                gift.setNum(getRandStr(8));
                gift.setName(getRandStr(8));
                gift.setCount(i+200);
                gift.getIntList().add(i);
            }
            giftList.add(gift);
        }
    }

    public static String getRandStr(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
