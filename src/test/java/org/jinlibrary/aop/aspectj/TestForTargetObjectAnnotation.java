/**
 * File：TestForTargetObjectAnnotation.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 下午2:05:52
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
 * Description: TestForTargetObjectAnnotation
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aspectj-annotation.xml")
public class TestForTargetObjectAnnotation {

  @Autowired
  private TargetObject1 targetObject1;

  @Autowired
  private TargetObject2 targetObject2;

  @Test
  public void testForAspectjAnnotation() {
    targetObject1.multiply(1, 6);
    targetObject1.deleteUser();
    System.out.println("================================");
    targetObject2.divide(16, 3);
    targetObject2.deleteProduct();
    System.out.println("========================================");
    // targetObject1.updateUser();
  }
}
