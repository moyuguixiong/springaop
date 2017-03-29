/**
 * File：TestForTargetObject.java
 * Package：org.jinlibrary.aop.havepointcut
 * Author：jin
 * Date：2017年3月28日 下午6:21:26
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.havepointcut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Description: TestForTargetObject
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-havepointcut.xml")
public class TestForTargetObject {

  /**
   * 带有切点的切面：
   * 优点：
   * 1、被代理对象和代理对象可以同时在容器中，都可以被使用。
   * 2、可以对被代理对象的特定方法进行增强，使用灵活。
   * 缺点：
   * 1、每次只能对一个对象生成代理，多个对象要配置多次，配置繁琐。
   */

  @Autowired
  @Qualifier("proxyForTargetObject")
  private TargetObject proxyForTargetObject;

  @Test
  public void testAround() {
    proxyForTargetObject.sayMessage("hello");
    System.out.println("=================");
    proxyForTargetObject.find();
  }
}
