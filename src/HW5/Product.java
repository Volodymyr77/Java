package HW5;

import java.util.Objects;

public class Product {

    String productName;
    int Price;
    String type;
    String packag;
    int weight;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPackag() {
        return packag;
    }

    public void setPackag(String packag) {
        this.packag = packag;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Product() {
    }

    public Product(String productName, int price, String type, String packag, int weight) {
        this.productName = productName;
        Price = price;
        this.type = type;
        this.packag = packag;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", Price=" + Price +
                ", type='" + type + '\'' +
                ", packag='" + packag + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Price == product.Price && weight == product.weight && Objects.equals(productName, product.productName) && Objects.equals(type, product.type) && Objects.equals(packag, product.packag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, Price, type, packag, weight);
    }
}
