package com.shuwangliantong.ehradapter.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class X509UserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 在这里，我们不查数据库，而是直接信任从证书传来的用户名(CN)
        // 并为他创建一个 UserDetails 对象
        if (username == null || username.isEmpty()) {
            throw new UsernameNotFoundException("Username (CN from certificate) is empty.");
        }

        // 创建一个UserDetails对象
        // 参数：用户名，密码（对于预认证无意义，可以为空），权限列表
        // 我们在这里授予一个 "ROLE_USER" 的默认权限，以便后续授权
        return new User(username, "", AuthorityUtils.createAuthorityList("ROLE_USER"));
    }
}