package com.sec4j.framework.db;

import javax.sql.DataSource;

/**
 * 数据源工厂
 * ClassName: DataSourceFactory 
 * @author songge
 * @date 2014-10-26
 * @since 0.1
 */
public interface DataSourceFactory {

	/**
	 * 获取数据源
	 * @Description 
	 * @return DataSource
	 * @author songge
	 * @date 2014-10-26
	 */
	DataSource getDataSource();
}
