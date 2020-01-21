import java.lang.reflect.Proxy;

/**
 * SimpleAOP
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:34 上午
 */
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
