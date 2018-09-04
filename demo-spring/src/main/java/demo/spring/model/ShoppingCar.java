package demo.spring.model;

import java.util.Date;
import java.util.List;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
public class ShoppingCar {
    private String name;
    private Date createdOn;

    public ShoppingCar(String name, Date createdOn, List<ShoppingProduct> shoppingProducts) {
        this.name = name;
        this.createdOn = createdOn;
        this.shoppingProducts = shoppingProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }


    private List<ShoppingProduct> shoppingProducts;

    public List<ShoppingProduct> getShoppingProducts() {
        return shoppingProducts;
    }

    public void setShoppingProducts(List<ShoppingProduct> shoppingProducts) {
        this.shoppingProducts = shoppingProducts;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                ", shoppingProducts=" + shoppingProducts +
                '}';
    }
}
