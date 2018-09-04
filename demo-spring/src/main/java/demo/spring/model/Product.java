package demo.spring.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
@Component
//@Profile("dev2")
public class Product {
    private Long id;
    private String nme;
    private Double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nme='" + nme + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNme() {
        return nme;
    }

    public void setNme(String nme) {
        this.nme = nme;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(Long id, String nme, Double price) {

        this.id = id;
        this.nme = nme;
        this.price = price;
    }
}
