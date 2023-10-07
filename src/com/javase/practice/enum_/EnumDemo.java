package com.javase.practice.enum_;

import java.io.StringReader;

/**
 * 枚举
 * @author:hjy
 * @date 2023/10/6 21:30
 */
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);

        System.out.println(Season2.SUMMER);
        System.out.println(Season2.SUMMER.getDesc());
        Season2[] seasons = Season2.values();
        for (Season2 season:seasons){
            System.out.println(season);
        }

        //自定义枚举
        System.out.println("===自定义枚举===");
        System.out.println(Season3.SPRING);
        System.out.println(Season3.SPRING.getName());
        System.out.println(Season3.SPRING.getDesc());
    }
}

/**
 * enum枚举
 */
enum Season1{
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

enum Season2{
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");

    private final String name;

    private Season2(String desc) {
        this.name = desc;
    }

    public String getDesc() {
        return name;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "desc='" + name + '\'' +
                '}';
    }
}

class Season3{
    private final String name;
    private final String desc;
    public static final Season3 SPRING = new Season3("春天","温暖");
    public static final Season3 SUMMER = new Season3("夏天","炎热");
    public static final Season3 AUTUMN = new Season3("秋天","凉爽");
    public static final Season3 WINTER = new Season3("冬天","寒冷");

    private Season3(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season3{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
