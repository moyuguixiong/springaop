/**
 * File：JdkProxy.java
 * Package：org.jinlibrary.aop.jdkandcglibproxy
 * Author：jin
 * Date：2017年3月29日 下午2:46:00
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.jdkandcglibproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * <p>
 * Description: JdkProxy
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class JdkProxy {

  @Test
  public void test() {
    Chinese chinese = new Chinese();
    Speak speak = (Speak) Proxy.newProxyInstance(chinese.getClass().getClassLoader(), chinese
        .getClass().getInterfaces(), chinese);
    speak.say("How do you do!");
  }
}

interface Speak {

  public abstract void say(String message);
}

class Chinese implements Speak, InvocationHandler {

  @Override
  public void say(String message) {
    System.out.println("I'm Chinese," + message);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("前置增强");
    Object result = method.invoke(this, args);
    System.out.println("后置增强");
    return result;

  }

}
