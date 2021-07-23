package zhujie;



import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 注解的本质就是一个Annotation接口：
 *      注解中其实是可以有属性和方法，但是接口中的属性都是static final的，对于注解来说没什么意义，
 *      而我们定义接口的方法就相当于注解的属性，也就对应了前面说的为什么注解只有属性成员变量，其实他
 *      就是接口的方法，这就是为什么成员变量会有括号，
 *
 * 注解括号的参数被称为注解属性
 * 注解属性类型可以有以下列出的类型
 *  1.基本数据类型
 *  2.String
 *  3.枚举类型
 *  4.注解类型
 *  5.Class类型
 *  6.以上类型的一维数组类型
 */


@Inherited //一个被@Inherited注解了的注解修饰了一个父类，如果他的子类没有被其他注解修饰，则它的子类也继承了父类的注解。
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MySelf {
    String name() default "wang";
    int age() default 18;
}

@MySelf(name = "father",age = 35)
@Game("LOl")
@Game("FPS")
class Father{
}

class Son extends Father{
}


class MySelfTest{

    public static void main(String[] args) {

        /**
         * 获取类注解属性
         */

        final Class<Father> fatherClass = Father.class;
        final boolean annotationPresent = fatherClass.isAnnotationPresent(MySelf.class);
        if(annotationPresent){
            final MySelf annotation = fatherClass.getAnnotation(MySelf.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }

        /**
         * 获取方法注解属性
         */
        try {
            final Method play = fatherClass.getDeclaredMethod("play");
            People annotation2 = play.getAnnotation(People.class);
            Game[] value = annotation2.value();
            for (Game game : value) {
                System.out.println(game.value());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}


