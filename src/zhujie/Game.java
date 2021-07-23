package zhujie;

import java.lang.annotation.*;

/**游戏注解*/
@Repeatable(People.class) //被这个元注解修饰的注解可以同时作用一个对象多次，但是每次作用注解又可以代表不同的含义。
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Game {
    String value() default "";
}
