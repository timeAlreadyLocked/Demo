package demo.spring.service.impl;

import demo.spring.model.User;
import demo.spring.service.ShoppingCarService;
import demo.spring.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
@Service("userServiceImpl")
@Primary
public class UserServcieImpl implements UserService {
    private final ShoppingCarService shoppingCarService;

    public UserServcieImpl(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    public User getUserById() {
        return new User(1L, "李鹏举");
    }
}
