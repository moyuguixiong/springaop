/**
 * File：Test.java
 * Package：org.jinlibrary.aop.nonpointcut
 * Author：jin
 * Date：2017年3月28日 下午4:47:38
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.nonpointcut;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <p>
 * Description: 没有切点的增强类
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
public class BeforeAdvice implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    if (method.getName().equals("add")) {
      System.out.println("前置增强");
    }
  }
}
