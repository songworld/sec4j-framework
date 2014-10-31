package com.sec4j.framework.core.impl.support;

import java.lang.annotation.Annotation;

/**
 * 用于获取注解类的模板类
 * ClassName: AnnotationClassTemplate 
 * @author songge
 * @date 2014-10-27
 * @since 0.1
 */
public abstract class AnnotationClassTemplate extends ClassTemplate {

    protected final Class<? extends Annotation> annotationClass;

    protected AnnotationClassTemplate(String packageName, Class<? extends Annotation> annotationClass) {
        super(packageName);
        this.annotationClass = annotationClass;
    }
}
