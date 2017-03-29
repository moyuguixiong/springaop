/**
 * File：AroundAdvice.java
 * Package：org.jinlibrary.aop.nonpointcut
 * Author：jin
 * Date：2017年3月28日 下午5:19:14
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.havepointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * <p>
 * Description: AroundAdvice
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
public class AroundAdvice implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    before();
    Object result = methodInvocation.proceed();
    after();
    return result;
  }

  private void before() {
    System.out.println("环绕增强前置......");
  }

  private void after() {
    System.out.println("环绕增强后置......");
  }

}
