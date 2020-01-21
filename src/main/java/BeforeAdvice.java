import java.lang.reflect.Method;

/**
 * BeforeAdvice
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:33 上午
 */
public class BeforeAdvice implements Advice {
    private Object bean;
    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在目标方法执行前调用通知
        // 之前学习动态代理时，是调用该类内部的方法，现在调用外部传入的类的方法
        methodInvocation.invoke();
        return method.invoke(bean, args);
    }
}