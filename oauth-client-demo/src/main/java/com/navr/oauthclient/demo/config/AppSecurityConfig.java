package com.navr.oauthclient.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                        (req) -> req
//                                .requestMatchers("/user")
//                                .authenticated()
//                                .requestMatchers("/welcome")
//                                .permitAll() // no auth for these requests
                                .anyRequest().authenticated()
                )
                .oauth2Login(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
