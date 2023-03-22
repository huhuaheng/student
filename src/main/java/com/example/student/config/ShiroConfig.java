package com.example.student.config;




import com.example.student.config.shiro.UserRealm;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.spring.boot.autoconfigure.ShiroAutoConfiguration;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName ShiroConfig
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/23 16:24
 * @Version 1.0
 **/
@Configuration
public class ShiroConfig {



    @Bean
    public UserRealm userRealm() {
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 配置登录url和登录成功url
        shiroFilterFactoryBean.setLoginUrl("/user/login");
        shiroFilterFactoryBean.setSuccessUrl("/home");
        // 配置未授权跳转页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");

        // 配置过滤器
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        // 配置不需要过滤的url
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/user/login", "anon");
        filterChainDefinitionMap.put("/swagger**", "anon");
        filterChainDefinitionMap.put("/user/logout", "logout");
        // 配置需要过滤的url
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

//    /**
//     * 配置Shiro的Filter
//     *
//     * @return Filter
//     */
//    @Bean
//    public FilterRegistrationBean<DelegatingFilterProxy> filterRegistrationBean() {
//        FilterRegistrationBean<DelegatingFilterProxy> filterRegistrationBean = new FilterRegistrationBean<>();
//        DelegatingFilterProxy proxy = new DelegatingFilterProxy("shiroFilter");
//        proxy.setTargetFilterLifecycle(true);
//        filterRegistrationBean.setFilter(proxy);
//        return filterRegistrationBean;
//    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager(UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }





}
