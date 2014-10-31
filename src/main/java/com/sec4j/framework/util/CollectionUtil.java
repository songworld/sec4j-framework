package com.sec4j.framework.util;

import java.util.Collection;
import org.apache.commons.collections.CollectionUtils;

/**
 * 集合操作工具类
 * 
 * ClassName: CollectionUtil 
 * @author songge
 * @date 2014-10-28
 * @since 0.1
 */
public class CollectionUtil {

    /**
     * 判断集合是否非空
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return CollectionUtils.isNotEmpty(collection);
    }

    /**
     * 判断集合是否为空
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }
}
