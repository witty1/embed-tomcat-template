package design.wit.embed.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import java.util.List;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/8
 * @Time: 17:04
 * @Description: 配置类
 */
@Configuration
@EnableWebMvc
@ComponentScan("design")
public class AppConfig extends WebMvcConfigurationSupport {

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();
        converters.add(messageConverter);
    }


}
