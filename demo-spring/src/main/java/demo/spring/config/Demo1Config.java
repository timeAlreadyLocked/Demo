package demo.spring.config;

import demo.spring.external.TencentAiSDK;
import demo.spring.external.TencentBase;
import demo.spring.service.UserService;
import org.springframework.context.annotation.*;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
@Configuration
@ComponentScan(basePackageClasses = {UserService.class})
@Profile(value = "dev2")
public class Demo1Config {

    @Bean
    public TencentAiSDK tencentAiSDK(TencentBase tencentBase) {
        return new TencentAiSDK(tencentBase);
    }

    @Bean
    public TencentBase tencentBase() {
        return new TencentBase();
    }
}
