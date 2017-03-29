/**
 * File：TargetObject2.java
 * Package：org.jinlibrary.aop.aspectj
 * Author：jin
 * Date：2017年3月29日 上午10:31:00
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.aspectj;

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

  public double divide(int a, int b) {
    double result = (double) a / b;
    System.out.println("除法结果：" + result);
    return result;
  }

  public void deleteProduct() {
    System.out.println("删除商品");
  }
}
