package dio.spring.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeRequests()
          .requestMatchers("/login").permitAll()
          .requestMatchers("/").permitAll()
          .requestMatchers("/managers").hasAnyRole("MANAGERS")
          .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
          .and()
          .formLogin().permitAll();
      return http.build();
    }

  @Bean
  public UserDetailsService inMemoryUserDetailsManager() {
    UserDetails user = User.builder()
        .username("user")
        .password("{noop}user123")
        .roles("USERS")
        .build();
    UserDetails admin = User.builder()
        .username("admin")
        .password("{noop}admin123")
        .roles("USERS", "MANAGERS")
        .build();
    return new InMemoryUserDetailsManager(user, admin);
  }

}
