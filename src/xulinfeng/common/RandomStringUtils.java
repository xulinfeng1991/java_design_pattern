package xulinfeng.common;

import java.util.Random;

/**
 * Created by xujiahong on 2017/10/10.
 * ======================功能列表======================
 */
public class RandomStringUtils {

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
