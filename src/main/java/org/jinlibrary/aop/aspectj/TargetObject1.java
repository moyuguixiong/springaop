/**
 * File：TargetObject1.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 上午9:58:37
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.aspectj;

/**
 * <p>
 * Description: TargetObject1
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class TargetObject1 {

  public int multiply(int a, int b) {
    int result = a * b;
    System.out.println("乘法结果：" + result);
    return result;
  }

  public void deleteUser() {
    System.out.println("删除用户");
  }

  public void updateUser() {
    int a = 1 / 0;
    System.out.println("更新用户信息");
  }
}
