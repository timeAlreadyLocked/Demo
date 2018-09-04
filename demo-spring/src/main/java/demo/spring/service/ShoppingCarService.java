package demo.spring.service;

import demo.spring.model.ShoppingCar;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
public interface ShoppingCarService {
    ShoppingCar getShoppingCarByUserId(String name,Integer age);
}
