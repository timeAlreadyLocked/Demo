package demo.spring.service.impl;

import demo.spring.external.TencentAiSDK;
import demo.spring.model.ShoppingCar;
import demo.spring.model.ShoppingProduct;
import demo.spring.service.ShoppingCarService;
import demo.spring.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON,proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCarServiceImpl implements ShoppingCarService {
    private final TencentAiSDK tencentAiSDK;
    private final UserService userService;

    @Lazy
    public ShoppingCarServiceImpl(TencentAiSDK tencentAiSDK,@Qualifier("userServiceImpl") UserService userService) {
        this.tencentAiSDK = tencentAiSDK;
        this.userService = userService;
    }

    public ShoppingCar getShoppingCarByUserId(String name,Integer age) {
        System.out.println(tencentAiSDK.getTextByPicture());
        System.out.println(userService.getUserById());
        if(true){
            throw new RuntimeException("运行时错误");
        }
        return new ShoppingCar(name,
                new Date(),
                Arrays.asList(new ShoppingProduct(1L, "华为nove3", 99D, 12L, 90D),
                        new ShoppingProduct(2L, "小米Mix3", 90D, 11L, 80D)));
    }
}
