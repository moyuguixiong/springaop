/**
 * File：TargetObject.java
 * Package：org.jinlibrary.aop.havapointcut
 * Author：jin
 * Date：2017年3月28日 下午6:02:01
 * Copyright (C) 2017-2017 房天下-版权所有
 */
package org.jinlibrary.aop.havepointcut;

/**
 * <p>
 * Description: TargetObject
 * </p>
 *
 * @author jinshilei
 *         2017年3月28日
 * @version 1.0
 *
 */
public class TargetObject {

  public String sayMessage(String message) {
    String string = "target:" + message;
    System.out.println(string);
    return string;
  }

  public void find() {
    System.out.println("查询数据......");
  }
}
