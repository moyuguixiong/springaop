/**
 * File：CglibProxy.java
 * Package：org.jinlibrary.aop.jdkandcglibproxy
 * Author：jin
 * Date：2017年3月29日 下午2:54:29
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.jdkandcglibproxy;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * <p>
 * Description: CglibProxy
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class CglibProxy {

  @Test
  public void testForCglib() {
    Japanese japanese = CglibProxyUtils.createProxy(Japanese.class, new MethodInterceptor() {

      @Override
      public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy)
          throws Throwable {
        System.out.println("前置增强");
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("后置增强");
        return result;
      }
    });

    int result = japanese.eatShit();
    System.out.println(result);
  }
}

class Japanese {

  public int eatShit() {
    System.out.println("我是日本人，屎真香");
    return 1;
  }
}

class CglibProxyUtils {

  @SuppressWarnings("unchecked")
  public static <T> T createProxy(Class<T> clazz, MethodInterceptor methodInterceptor) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(methodInterceptor);
    return (T) enhancer.create();
  }
}
