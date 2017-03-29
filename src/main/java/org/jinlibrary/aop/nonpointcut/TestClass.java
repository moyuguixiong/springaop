/**
 * File：TestClass.java
 * Package：org.jinlibrary.aop.nonpointcut
 * Author：jin
 * Date：2017年3月28日 下午4:50:50
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.nonpointcut;

/**
 * <p>
 * Description: TestClass
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
public class TestClass {

  public int add(int a, int b) {
    int sum = a + b;
    System.out.println("计算加和值：" + sum);
    return sum;
  }

  public void delete() {
    System.out.println("删除...");
  }
}
