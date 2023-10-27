package com.hopefundteam18.hopefund.Config;

import com.hopefundteam18.hopefund.Service.CustomSuccessHandler;
import com.hopefundteam18.hopefund.Service.CustomUserDetailsService;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig{


    @Autowired
    CustomSuccessHandler customSuccessHandler;

    /*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


        http.csrf(c -> c.disable())

                .authorizeHttpRequests(request -> request.antMatchers("/admin-page")
                        .hasAuthority("ADMIN").antMatchers("/user-page").hasAuthority("USER")
                        .antMatchers("/registration", "/css/**").permitAll()
                        .anyRequest().authenticated())

                .formLogin(form -> form.loginPage("/login").loginProcessingUrl("/login")
                        .successHandler(customSuccessHandler).permitAll())

                .logout(form -> form.invalidateHttpSession(true).clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout").permitAll());

        *//*http.authorizeRequests()
                .requestMatchers(
                        new AntPathRequestMatcher("/admin-page/**"),
                        new AntPathRequestMatcher("/user-page/**")
                ).permitAll().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().permitAll();*//*




                *//*http.csrf(c -> c.disable()).authorizeHttpRequests(request -> request.requestMatchers("/admin-page")
                        .hasAuthority("ADMIN").requestMatchers("/user-page").hasAuthority("USER")
                        .requestMatchers("/productowner-page").hasAuthority("PRODUCTOWNER")
                        .requestMatchers("/index", "/css/**").permitAll()
                        .anyRequest().authenticated())

                .formLogin(form -> form.loginPage("/login").loginProcessingUrl("/login")
                        .successHandler(customSuccessHandler).permitAll())

                .logout(form -> form.invalidateHttpSession(true).clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout").permitAll());

        *//*
        return http.build();
    }*/

    /*@Autowired
    public void configure (AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
    }*/
}

