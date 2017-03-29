/**
 * File：AdviceForXml.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 上午10:33:20
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StringUtils;

/**
 * <p>
 * Description: AdviceForXml
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class AdviceForXml {

  /**
   * 单纯的前置增强和后置增强，不能阻止被增强方法的执行，只有环绕增强可以阻止被增强方法的执行
   */

  public void before(JoinPoint joinPoint) {
    System.out.println("前置增强");
  }

  public void afterReturning(Object returnValue) {
    if (!StringUtils.isEmpty(returnValue)) {
      System.out.println("方法返回值：" + returnValue);
    }
    System.out.println("后置增强");
  }

  public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("环绕前置增强");
    Object result = proceedingJoinPoint.proceed();
    System.out.println("环绕后置增强");
    return result;
  }

  public void afterThrowing(Throwable exception) {
    System.out.println("发生异常" + exception.getMessage());
    exception.printStackTrace();
  }
}
