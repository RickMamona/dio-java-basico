package dio.dio.spring.security.jwt.security;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.apache.catalina.servlets.WebdavServlet;
import org.h2.server.web.WebServlet;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  {
    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    private static final String[] SWAGGER_WHITELIST = {
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { 
    http.headers().frameOptions().disable();
    http.cors().and().csrf().disable()
            .addFilterAfter(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
            .authorizeRequests()
            .requestMatchers(SWAGGER_WHITELIST).permitAll()
            .requestMatchers("/h2-console/**").permitAll()
            .requestMatchers(HttpMethod.POST,"/login").permitAll()
            .requestMatchers(HttpMethod.POST,"/users").permitAll()
            .requestMatchers(HttpMethod.GET,"/users").hasAnyRole("USERS","MANAGERS")
            .requestMatchers("/managers").hasAnyRole("MANAGERS")
            .anyRequest().authenticated()
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            return http.build();
}
    
    @Bean //HABILITANDO ACESSAR O H2-DATABSE NA WEB
    public ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebdavServlet());
        registrationBean.addUrlMappings("/h2-console/*");
        return registrationBean;
    
}
}

