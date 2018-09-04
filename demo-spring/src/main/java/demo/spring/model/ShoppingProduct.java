package demo.spring.model;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
public class ShoppingProduct extends Product{
    private Long quantity;
    private Double retailPrice;

    public ShoppingProduct(Long id, String nme, Double price, Long quantity, Double retailPrice) {
        super(id, nme, price);
        this.quantity = quantity;
        this.retailPrice = retailPrice;
    }

    public Long getQuantity() {

        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "ShoppingProduct{" +
                "quantity=" + quantity +
                ", retailPrice=" + retailPrice +
                '}';
    }
}
