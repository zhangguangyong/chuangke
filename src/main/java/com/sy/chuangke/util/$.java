package com.sy.chuangke.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * 工具类的Face模式
 */
public class $ {

    /** ++++++++++++++++++++++++++ 引用工具类，方便通过IDE快速调用 ++++++++++++++++++++++++ */
	
	/** 字符串工具类 */
    public static Strings strings = Strings.getInstance();

    /** 流工具类 */
    public static Streams streams = Streams.getInstance();
    
    /** 反射类 */
    public static Reflections reflections = Reflections.getInstance();

    /*------------------------------ 空值判断 -------------------------------*/
    /**
     * 为Null判断
     * @param value
     * @return
     */
    public static boolean isNull(Object value) {
        return null == value;
    }

    /**
     * 为空判断
     * @param value
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static boolean isEmpty(Object value) {
        if (isNull(value)) {
            return true;
        }

        Class<? extends Object> valueClass = value.getClass();
        //数组
        if (valueClass.isArray()) {
            return Array.getLength(value) <= 0;
        }

        //集合
        if (Collection.class.isAssignableFrom(valueClass)) {
            return ((Collection) value).isEmpty();
        }

        //键值对
        if (Map.class.isAssignableFrom(valueClass)) {
            return ((Map) value).isEmpty();
        }

        //字符序列
        if (CharSequence.class.isAssignableFrom(valueClass)) {
            return ((CharSequence) value).toString().trim().length() <= 0;
        }

        return false;
    }

    /**
     * 非Null判断
     * @param value
     * @return
     */
    public static boolean notNull(Object value){
        return ! isNull(value);
    }

    /**
     * 非空判断
     * @param value
     * @return
     */
    public static boolean notEmpty(Object value){
        return ! isEmpty(value);
    }

    /*------------------------------ 空值检查 -------------------------------*/

    /**
     * 非Null检查，如果value值为Null，则抛出异常
     * @param value
     * @param message
     */
    public static void checkNotNull(Object value, String message){
        if( isNull(value) ){
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotNull(Object value){
        checkNotNull(value, null);
    }

    /**
     * 非空检查，如果value值为空，则抛出异常
     * @param value
     * @param message
     */
    public static void checkNotEmpty(Object value, String message){
        if( isEmpty(value) ){
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotEmpty(Object value){
        checkNotEmpty(value, null);
    }

}
