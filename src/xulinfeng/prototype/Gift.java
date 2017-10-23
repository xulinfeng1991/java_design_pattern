package xulinfeng.prototype;

import java.util.ArrayList;

/**
 * Created by xujiahong on 2017/10/10.
 * ======================功能列表======================
 */
public class Gift implements Cloneable{
    private String name = "中秋节礼物";
    private String num = "";
    private final int weight = 5;
    private float price = 999.9f;
    private char level = 's';
    private boolean canBuy = false;
    private Integer count = new Integer(0);
    private ArrayList<Integer> intList = new ArrayList<Integer>();

    @Override
    protected Gift clone(){
        Gift gift = null;
        try{
            gift = (Gift)super.clone();
            intList = (ArrayList<Integer>) intList.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return gift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public boolean isCanBuy() {
        return canBuy;
    }

    public void setCanBuy(boolean canBuy) {
        this.canBuy = canBuy;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public ArrayList<Integer> getIntList() {
        return intList;
    }

    public void setIntList(ArrayList<Integer> intList) {
        this.intList = intList;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", level=" + level +
                ", canBuy=" + canBuy +
                ", count=" + count +
                ", hashcode=" + this.hashCode() +
                ", countHashcode=" + count.hashCode() +
                ", nameHashcode=" + name.hashCode() +
                ", list=" + intList +
                ", listHashcode=" + intList.hashCode() +
                '}';
    }
}
