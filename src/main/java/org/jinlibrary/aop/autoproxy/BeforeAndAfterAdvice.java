/**
 * File：BeforeAndAfterAdvice.java
 * Package：org.jinlibrary.aop.autoproxy
 * Author：jin
 * Date：2017年3月29日 上午9:29:22
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.autoproxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.util.StringUtils;

/**
 * <p>
 * Description: BeforeAndAfterAdvice
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class BeforeAndAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

  /**
   * 前置增强和后置增强都不能阻止被增强方法的执行，只有环绕增强可以阻止被增强方法的执行
   */

  @Override
  public void afterReturning(Object result, Method method, Object[] args, Object target)
      throws Throwable {
    if (!StringUtils.isEmpty(result)) {
      System.out.println(result);
    }
    System.out.println("后置增强......");
  }

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println("前置增强......");
  }

}
