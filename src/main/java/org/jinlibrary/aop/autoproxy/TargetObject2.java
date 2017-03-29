/**
 * File：TargetObject2.java
 * Package：org.jinlibrary.aop.autoproxy
 * Author：jin
 * Date：2017年3月29日 上午9:42:11
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.autoproxy;

/**
 * <p>
 * Description: TargetObject2
 * </p>
 *
 * @author jinshilei
 *         2017年3月29日
 * @version 1.0
 *
 */
public class TargetObject2 {

  public int add(int a, int b) {
    int result = a + b;
    System.out.println("加号结果：" + result);
    return result;
  }

  public void saveProduct() {
    System.out.println("保存商品");
  }
}
