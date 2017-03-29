/**
 * File：AfterAdvice.java
 * Package：org.jinlibrary.aop.nonpointcut
 * Author：jin
 * Date：2017年3月28日 下午5:37:07
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.nonpointcut;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.util.StringUtils;

/**
 * <p>
 * Description: AfterAdvice
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
public class AfterAdvice implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object result, Method method, Object[] args, Object target)
      throws Throwable {
    // 后置增强可以拿到被通知方法的返回值
    if (!StringUtils.isEmpty(result)) {
      System.out.println(result);
    }
    System.out.println("后置增强");
  }

}
