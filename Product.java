public class Product {
    private String name;
    private double price;
    private int code;
    private int quantity;

    public Product(String name, double price, int code)
    {
        this.name = name;
        this.price = price;
        this.code = code;
    }
    public Product(String name, double price, int code, int quantity)
    {
        this.name = name;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }
}
