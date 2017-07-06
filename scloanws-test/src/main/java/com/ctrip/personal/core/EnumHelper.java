package com.ctrip.personal.core;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ljxin on 2017/7/6.
 */
public class EnumHelper {
    /***
     * 判断输入值是否超出枚举范围
     * @param enumClass 枚举类
     * @param inputEnumName 输入枚举项
     * @param methodName 获取枚举值get方法
     * @param <T1> 枚举class
     * @param <T2> 枚举项数据类型
     * @return
     * @throws Exception
     */
    public <T1, T2> Boolean isContains(Class<T1> enumClass, T2 inputEnumName, String methodName) throws Exception {
    Set<String> enumCodes = new HashSet<String>();
    for (Object obj : enumClass.getEnumConstants()) {
      Method getCode = obj.getClass().getDeclaredMethod(methodName);
      if (getCode.invoke(obj).equals(inputEnumName)) {
        return true;
      }
    }
    return false;
  }
}
