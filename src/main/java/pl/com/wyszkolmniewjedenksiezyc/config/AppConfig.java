package pl.com.wyszkolmniewjedenksiezyc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Configuration
public class AppConfig {
//
//    @Bean
//    public FilterRegistrationBean corsFilter(@Value("${tagit.origin:http://localhost:3000}") String origin) {
//
//        return new FilterRegistrationBean(new Filter() {
//
//            @Override
//            public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//
//                HttpServletRequest servletRequest = (HttpServletRequest) request;
//                HttpServletResponse servletResponse = (HttpServletResponse) response;
//
//                String method = servletRequest.getMethod();
//
//                servletResponse.setHeader("Access-Control-Allow-Origin", origin);
//                servletResponse.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
//                servletResponse.setHeader("Access-Control-Max-Age", Long.toString(60*60));
//                servletResponse.setHeader("Access-Control-Allow-Credentials", "true");
//                servletResponse.setHeader("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
//
//                if("OPTIONS.".equals(method)) {
//                    servletResponse.setStatus(HttpStatus.OK.value());
//                } else {
//                    filterChain.doFilter(servletRequest, servletResponse);
//                }
//            }
//
//            @Override
//            public void init(FilterConfig filterConfig) throws ServletException {}
//
//            @Override
//            public void destroy() {}
//
//        });
//    }

}
