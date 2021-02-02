package structure.dongtaidaili;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {


    public static void main(String[] args) {

        final Person zhangsan  = new Student("张三");

        final Person lisi = new Student("李四");

        final ProxyHandler proxyHandler = new ProxyHandler(zhangsan);

        final Person person1 = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, proxyHandler);
        person1.setName();

        proxyHandler.setObj(lisi);
        person1.getName();

    }

}
