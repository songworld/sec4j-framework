package com.sec4j.framework;

import com.sec4j.framework.core.ConfigHelper;

public interface FrameworkConstant {

    String UTF_8 = "UTF-8";

    String CONFIG_PROPS = "sec4j.properties";
    String SQL_PROPS = "sec4j-sql.properties";

    String PLUGIN_PACKAGE = "com.sec4j.plugin";

    String JSP_PATH = ConfigHelper.getString("sec4j.framework.app.jsp_path", "/WEB-INF/jsp/");
    String WWW_PATH = ConfigHelper.getString("sec4j.framework.app.www_path", "/www/");
    String HOME_PAGE = ConfigHelper.getString("sec4j.framework.app.home_page", "/index.html");
    int UPLOAD_LIMIT = ConfigHelper.getInt("sec4j.framework.app.upload_limit", 10);

    String PK_NAME = "id";
}
