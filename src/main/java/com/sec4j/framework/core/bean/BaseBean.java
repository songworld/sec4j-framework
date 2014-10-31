package com.sec4j.framework.core.bean;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 提供 Bean 类的基础特性
 * ClassName: BaseBean 
 * @author songge
 * @date 2014-10-27
 * @since 0.1
 */
public abstract class BaseBean implements Serializable {

    /**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -5006394162974945410L;

	@Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
