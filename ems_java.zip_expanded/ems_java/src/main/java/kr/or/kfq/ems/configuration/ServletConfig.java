package kr.or.kfq.ems.configuration;

import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@EnableWebMvc
@ComponentScan(basePackages = { "kr.or.kfq.ems" })
public class ServletConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		registry.viewResolver(bean);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/resources/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/css/");
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/");
	}

	@Bean
	public MultipartResolver multipartResolver() {
		StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
		return resolver;
	}

	@Bean
	public SimpleMappingExceptionResolver exceptionResolver() {
		Properties mappings = new Properties();
		mappings.setProperty("java.lang.RuntimeException", "error/runtime");
		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
		exceptionResolver.setExceptionMappings(mappings);
		exceptionResolver.setDefaultErrorView("error/default");
		return exceptionResolver;
	}
//	@Override
//	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//	    for (HttpMessageConverter<?> converter : converters) {
//	        if (converter instanceof MappingJackson2HttpMessageConverter) {
//	        MappingJackson2HttpMessageConverter jacksonMessageConverter = (MappingJackson2HttpMessageConverter) converter;
//	        ObjectMapper objectMapper = jacksonMessageConverter.getObjectMapper();
//	        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//	        break;
//	        }
//	    }
//	}
	@Bean
	public MappingJackson2HttpMessageConverter jacksonMessageConverter() {
//		ObjectMapper mapper = new ObjectMapper();
		MappingJackson2HttpMessageConverter mapper = new MappingJackson2HttpMessageConverter();
		return mapper;
	}
}
