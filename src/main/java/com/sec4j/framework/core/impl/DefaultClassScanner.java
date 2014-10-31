package com.sec4j.framework.core.impl;

import java.lang.annotation.Annotation;
import java.util.List;
import com.sec4j.framework.core.ClassScanner;
import com.sec4j.framework.core.impl.support.AnnotationClassTemplate;
import com.sec4j.framework.core.impl.support.ClassTemplate;
import com.sec4j.framework.core.impl.support.SupperClassTemplate;

/**
 * 默认类扫描器
 * ClassName: DefaultClassScanner 
 * @author songge
 * @date 2014-10-27
 * @since 0.1
 */
public class DefaultClassScanner implements ClassScanner {

    @Override
    public List<Class<?>> getClassList(String packageName) {
        return new ClassTemplate(packageName) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                String className = cls.getName();
                String pkgName = className.substring(0, className.lastIndexOf("."));
                return pkgName.startsWith(packageName);
            }
        }.getClassList();
    }

    @Override
    public List<Class<?>> getClassListByAnnotation(String packageName, Class<? extends Annotation> annotationClass) {
        return new AnnotationClassTemplate(packageName, annotationClass) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return cls.isAnnotationPresent(annotationClass);
            }
        }.getClassList();
    }

    @Override
    public List<Class<?>> getClassListBySuper(String packageName, Class<?> superClass) {
        return new SupperClassTemplate(packageName, superClass) {
            @Override
            public boolean checkAddClass(Class<?> cls) {
                return superClass.isAssignableFrom(cls) && !superClass.equals(cls);
            }
        }.getClassList();
    }
}
