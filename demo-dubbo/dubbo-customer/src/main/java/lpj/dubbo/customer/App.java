package lpj.dubbo.customer;

import lpj.dubbo.api.DubboLoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiPengJu
 * @date 2018/7/29
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("customer.xml");
        DubboLoginService dubboLogin = (DubboLoginService) context.getBean("dubboLogin");
        System.out.println(dubboLogin.login("this fist dubbo demo"));
    }
}
