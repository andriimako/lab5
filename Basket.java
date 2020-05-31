import java.util.ArrayList;

public class Basket {
    private User user;
    private ArrayList<Product> products;
    private ArrayList<Product> inBasket;

    public void setUser(User user) {
        this.user = user;
    }

    public Basket() {
    }

    public Basket(User user) {
        this.user = user;
    }

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product product) throws Exception {
        if (inBasket.size() >= products.size()) {
            throw new Exception("Unable to add more");
        } else inBasket.add(product);
    }

    public void removeProduct(Product product) {
        inBasket.remove(product);
    }

    public int getNumberOfProducts() {
        return inBasket.size();
    }

    public double buy() {
        double total = 0;
        for (Product product : inBasket) {
            total += product.getPrice();
        }
        System.out.println("the total price is " + total);
        return total;
    }

}
