package designpattern.structural.proxy;

import designpattern.behavioral.observer.Observer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private Object obj;

    private SecurityProxy(Object obj){
        this.obj =obj;
    }

    public static Object newInstance(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        Object result;
        //you can put checks here to restrict calling any method
        result = method.invoke(obj,objects);
        return result;
    }
}
