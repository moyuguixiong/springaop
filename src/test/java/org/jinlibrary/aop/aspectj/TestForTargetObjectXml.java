/**
 * File：TestForTargetObject.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 上午10:49:19
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
@ContextConfiguration("classpath:spring-aspectj.xml")
public class TestForTargetObjectXml {

  /**
   * spring使用apectj进行aop和传统aop(advisor)的优势(aspect和advisor的比较)
   * 1、aspectj必传统aop多支持AfterThrowing和After增强
   * 2、控制带切点的切面，aspectj的切点表达式execution比传统的正则表达式patterns，控制更精细。比如可控制返回类型、参数类型、个数等
   * 3、aspectj可以使用注解，比传统aop开发使用更方便。
   *
   * aspectj的缺点：
   * 1、代理后，容器中只存在被代理后的对象，被代理前的对象不能被使用了。
   */

  @Autowired
  private TargetObject1 targetObject1;

  @Autowired
  private TargetObject2 targetObject2;

  @Test
  public void testForAspect() {
    targetObject1.multiply(1, 6);
    targetObject1.deleteUser();
    System.out.println("================================");
    targetObject2.divide(16, 3);
    targetObject2.deleteProduct();
  }
}
