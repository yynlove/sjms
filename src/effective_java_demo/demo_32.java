package effective_java_demo;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class demo_32 {


    static <T> T[] toArray(T...args){
        return args;
    }

    static <T> T[] pickTwo(T a, T b,T c){
        switch (ThreadLocalRandom.current().nextInt(2)){
            case 0: return toArray(a,b);
            case 1: return toArray(a,c);
        }
        throw new AssertionError();
    }

    public static void main(String[] args) {
        /**
         * java.lang.ClassCastException 报错
         * 编译器在pickTwo返回值做了一个隐藏的转换 String[] 转换失败了
         * 允许另一个方法访问一个泛型可变参数数组是不安全的；
         */
        String[]  strings = pickTwo("goog", "fast","aaaaa");
        System.out.println(strings[0]);
    }



}
