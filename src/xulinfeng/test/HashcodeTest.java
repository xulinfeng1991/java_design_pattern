package xulinfeng.test;

/**
 * String类源码可见，equals方法是根据字符逐一比较，hashcode的算法也类似。
 * ==1、用于基本数据类型的比较；2、判断引用是否指向堆内存的同一块地址。
 * Created by xujiahong on 2017/10/10.
 * ======================功能列表======================
 */
public class HashcodeTest {
    public static void main(String[] args) {
        String a = "a";
        String bc = "bc";
        String s1 = "abc";
        String s2 = "a"+"bc";
        String s3 = a+bc;
        String s4 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1==s2);//编译时期即可确定，所以相等
        System.out.println(s1==s3);
        System.out.println(s1==s4);

    }
}
