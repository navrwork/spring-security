package com.navr.oauth.googlelogin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                        (req) -> req
                                .requestMatchers("/welcome").permitAll()
                                .anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
