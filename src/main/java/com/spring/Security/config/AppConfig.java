package com.spring.Security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig
{
    @Autowired
    private UserDetailsService userDetailsService;
//   @Bean
//    public UserDetailsService userDetailsService()
//    {
//        UserDetails user1=User.builder().username("Sumit").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
//        UserDetails user2=User.builder().username("Raghav").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
//        UserDetails user3=User.builder().username("Praful").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
//        return new InMemoryUserDetailsManager(user1,user2,user3);
//    }


    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider()
    {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder());
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

}

