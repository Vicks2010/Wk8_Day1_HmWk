package models;

public class Order {

    private int id;
    private String productbought;

    public Order(int id, String productbought) {
        this.id = id;
        this.productbought = productbought;
    }

    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductbought() {
        return productbought;
    }

    public void setProductbought(String productbought) {
        this.productbought = productbought;
    }
}
