package service;

/**
 * HelloServiceImpl
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:35 上午
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}