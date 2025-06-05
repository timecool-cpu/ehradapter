package com.shuwangliantong.ehradapter.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .x509()
                // 默认从证书拿DN，不用UserDetailsService，不做业务查找
                .subjectPrincipalRegex("CN=(.*?)(?:,|$)")
                // 不设置userDetailsService，采用默认用户，只要证书有效即可
                .and()
                .authorizeRequests()
                .anyRequest().authenticated() // 只要有受信任的证书即可
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(authenticationEntryPoint())
                .and()
                .csrf().disable();
    }

    private AuthenticationEntryPoint authenticationEntryPoint() {
        return (request, response, authException) -> {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write(
                    "{\"code\":401,\"msg\":\"X.509证书无效或认证失败: " + authException.getMessage() + "\"}");
        };
    }
}
