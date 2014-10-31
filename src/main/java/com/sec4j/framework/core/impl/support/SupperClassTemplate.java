package com.sec4j.framework.core.impl.support;

/**
 * 用于获取子类的模板类
 * 
 * ClassName: SupperClassTemplate 
 * @author songge
 * @date 2014-10-27
 * @since 0.1
 */
public abstract class SupperClassTemplate extends ClassTemplate {

    protected final Class<?> superClass;

    protected SupperClassTemplate(String packageName, Class<?> superClass) {
        super(packageName);
        this.superClass = superClass;
    }
}
