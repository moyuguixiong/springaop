/**
 * File：TestForTargetObject.java
 * Package：org.jinlibrary.aop.autoproxy
 * Author：jin
 * Date：2017年3月29日 上午9:45:08
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.autoproxy;

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
 *         2017年3月29日
 * @version 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-autoproxy.xml")
public class TestForTargetObject {

  /**
   * 自动代理：
   * 优点：
   * 1、可以对多个对象进行自动代理，多个对象代理，只需要配置一次即可。
   * 2、可以使用带切点的切面，也可以使用不带切点的切面，比较灵活；可以选择对特定方法进行增强。
   * 缺点：
   * 1、自动代理后，容器中只有被代理后的对象，没有了被代理前的对象可以使用。
   */

  @Autowired
  @Qualifier("targetClass1")
  private TargetObject targetObject;

  @Autowired
  private TargetObject2 targetObject2;

  @Test
  public void testForAutoProxy() {
    targetObject.minus(7, 1);
    targetObject.saveUser();
    System.out.println("=============================");
    targetObject2.add(3, 5);
    targetObject2.saveProduct();
  }
}
