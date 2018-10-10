package org.smart4j.chapter2.util;

/**
 * 字符串工具类
 */
public final class StringUtil {
    /**
     * 判断字符串是否为空
     * @param strValue
     * @return
     */
    public static boolean isEmpty(String strValue) {
        if(strValue != null) {
            strValue = strValue.trim();
        }
        return StringUtil.isEmpty(strValue);
    }

    /**
     * 判断字符串是否非空
     * @param strValue
     * @return
     */
    public static boolean isNotEmpty(String strValue) {
        return !isEmpty(strValue);
    }
}
