/**
 * File：Test.java
 * Package：org.jinlibrary.aop.nonpointcut
 * Author：jin
 * Date：2017年3月28日 下午4:57:47
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.nonpointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Description: Test
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-nonpointcut.xml")
public class TestForTestClass {

  /**
   * 没有切点的aop
   * 优点：被代理前对象和代理对象同时存在于spring容器中，被代理前对象还可以被使用。
   * 缺点：
   * 1、因为没有切点，被代理对象的所有方法都被增强了，使用不灵活;要对特定方法进行增强，必须在通知代码中写代码判断，即通知代码中耦合特定业务，导致该通知只能应用特定业务.
   * 2、每次只能生成一个对象的代理对象，多个对象要配置多次，配置繁琐。
   */

  @Autowired
  @Qualifier("testClass")
  private TestClass testClass;

  @Autowired
  @Qualifier("proxyForTestClassBefore")
  private TestClass testClassProxyBefore;

  @Autowired
  @Qualifier("proxyForTestClassAfterReturning")
  private TestClass proxyForTestClassAfterReturning;

  @Autowired
  @Qualifier("proxyForTestClassAround")
  private TestClass proxyForTestClassAround;

  /**
   * 前置增强测试
   */
  @Test
  public void testBefore() {
    testClass.add(1, 2);
    testClass.delete();
    System.out.println("========================");
    testClassProxyBefore.add(1, 2);
    testClassProxyBefore.delete();
  }

  /**
   * 后置增强测试
   */
  @Test
  public void testAfterReturning() {
    testClass.add(1, 5);
    testClass.delete();
    System.out.println("========================");
    proxyForTestClassAfterReturning.add(1, 5);
    proxyForTestClassAfterReturning.delete();
  }

  /**
   * 环绕增强测试
   */
  @Test
  public void testAround() {
    testClass.add(1, 1);
    testClass.delete();
    System.out.println("========================");
    proxyForTestClassAround.add(1, 1);
    proxyForTestClassAround.delete();
  }

}
