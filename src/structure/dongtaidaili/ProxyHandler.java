package structure.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object obj;

    public ProxyHandler(Object object){
        this.obj = object;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("之前输出>>>>"+method.getName());
        method.invoke(obj,args);
        return null;
    }
}
