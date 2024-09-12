package ClassSpringBootSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Securityconfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for POST operations
            .authorizeRequests()
//                .antMatchers("/students").permitAll() // Allow access to POST and GET on /students
                .anyRequest().authenticated() // Authenticate any other request
            .and()
            .httpBasic(); // Use basic authentication

        return http.build();
    }
}