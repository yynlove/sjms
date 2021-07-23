package effective_java_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class demo_33 {

    private Map<Class<?>, Object> fa = new HashMap<>();
    public <T> void putFa(Class<T> type,T instance){
        fa.put(Objects.requireNonNull(type),instance);
    }
    public <T> T getFa(Class<T> type){
        return type.cast(fa.get(type));
    }

    public static void main(String[] args) {
        final demo_33 demo_33 = new demo_33();
        demo_33.putFa(String.class,"java");
        demo_33.putFa(Integer.class,1);
        final String fa = demo_33.getFa(String.class);
        System.out.println(fa);

    }

}
