package demo.spring.config;

import demo.spring.aspect.LogDemo;
import demo.spring.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author LiPengJu
 * @date 2018/9/2
 */
@Configuration
@ComponentScan(basePackageClasses = {Product.class,LogDemo.class})
@Profile("dev2")
@PropertySource(value="classpath:demo.properties",encoding = "utf-8")
@EnableAspectJAutoProxy
public class DemoContextConfig implements Condition{
    @Value("${demo}")
    private String title;
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Boolean reuslt = conditionContext.getEnvironment().containsProperty("dev2");
        String activeProfiles = conditionContext.getEnvironment().getProperty("demo");
        return reuslt;
    }

    @Bean
//    @Conditional(DemoContextConfig.class)
    public Product product() {
        return new Product(1L, title, 99D);
    }
    @Bean
    public LogDemo logDemo(){
        return new LogDemo();
    }
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
