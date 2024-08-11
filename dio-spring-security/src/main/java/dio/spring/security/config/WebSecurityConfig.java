package dio.spring.security.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Autowired
  private SecurityDatabaseService securityService;
      @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeRequests()
          .requestMatchers("/login").permitAll()
          .requestMatchers("/").permitAll()
          .requestMatchers("/managers").hasAnyRole("MANAGERS")
          .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
          .and()
          .httpBasic();
      return http.build();
    }
/* 
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
    */

}
