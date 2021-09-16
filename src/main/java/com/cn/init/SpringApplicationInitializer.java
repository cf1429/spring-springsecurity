package com.cn.init;

import com.cn.config.ApplicationConfig;
import com.cn.config.WebConfig;
import com.cn.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author:chenf
 * @Date:2021/9/14 14:50
 * @describe 加载spring容器
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    // spring容器，相当于加载applicationContext.xml
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }
    // servletContext 相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    // url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
