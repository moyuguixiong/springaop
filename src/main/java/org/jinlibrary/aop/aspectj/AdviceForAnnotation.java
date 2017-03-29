/**
 * File：AdviceForAnnotation.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 下午1:37:22
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * Description: AdviceForAnnotation
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
@Aspect
public class AdviceForAnnotation {

  @Pointcut("execution(* org.jinlibrary.aop.aspectj.*.delete*(..))")
  public void pointCutForDelete() {
  }

  @Pointcut("execution(* org.jinlibrary.aop.aspectj.*.divide(..))")
  public void pointCutForDivide() {
  }

  // @Pointcut("execution(* org.jinlibrary.aop.aspectj.*.multiply(..))")
  // public void pointCutForMultiply() {
  // }

  @Pointcut("execution(* org.jinlibrary.aop.aspectj.*.update*(..))")
  public void pointCutForUpdate() {
  }

  @Before(value = "AdviceForAnnotation.pointCutForDelete()")
  public void before(JoinPoint joinPoint) {
    System.out.println("前置增强");
  }

  @AfterReturning(value = "AdviceForAnnotation.pointCutForDivide()", returning = "returnValue")
  public void afterReturning(Object returnValue) {
    if (!StringUtils.isEmpty(returnValue)) {
      System.out.println("后置增强......方法返回值：" + returnValue);
    }
  }

  @AfterThrowing(value = "AdviceForAnnotation.pointCutForUpdate()", throwing = "exception")
  public void afterThrowing(Throwable exception) {
    System.out.println("发生异常：" + exception.getMessage());
  }
}
