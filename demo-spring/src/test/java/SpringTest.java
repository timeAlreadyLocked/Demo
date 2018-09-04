import demo.spring.config.Demo1Config;
import demo.spring.config.DemoContextConfig;
import demo.spring.model.Product;
import demo.spring.service.ShoppingCarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Demo1Config.class, DemoContextConfig.class})
@ActiveProfiles(value = "dev2")
public class SpringTest {

    @Autowired
    private ShoppingCarService shoppingCarService;
    @Autowired
    private Product product;

    @Test
    public void loadBeans() {
        shoppingCarService.getShoppingCarByUserId("李鹏举购物车",12);
        System.out.println(product);
    }

}
