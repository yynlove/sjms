package effective_java_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class demo_65 {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //throws ClassNotFoundException
        Class<? extends Set<String>> cl = (Class<? extends Set<String>>)Class.forName(args[0]);;
        //throws NoSuchMethodException
        final Constructor<? extends Set<String>> cons = cl.getDeclaredConstructor();
        //throws IllegalAccessException, InvocationTargetException, InstantiationException
        final Set<String> set = cons.newInstance();
        //set操作

    }



}
