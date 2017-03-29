/**
 * File：TargetClass.java
 * Package：org.jinlibrary.aop.autoproxy
 * Author：jin
 * Date：2017年3月29日 上午9:20:58
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.autoproxy;

/**
 * <p>
 * Description: TargetClass
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class TargetObject {

  public int minus(int a, int b) {
    int result = a - b;
    System.out.println("减法结果：" + result);
    return result;
  }

  public void saveUser() {
    System.out.println("保存用户");
  }
}
