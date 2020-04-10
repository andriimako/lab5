import java.util.ArrayList;

public class Category {
    public String name;
    public ArrayList<Product> product = new ArrayList<>();

    public Category(String name, ArrayList<Product> product)
    {
        this.name = name;
        this.product = product;
    }
    public Category(ArrayList<Product> product)
    {
        this.name = null;
        this.product = product;
    }
    public Category()
    {
        this.product = new ArrayList<>();
    }

    public void add(Product b)
    {
        product.add(b);
    }
    public void remove(Product b)
    {
        product.remove(b);
    }
    public void rename(String name)
    {
        this.name = name;
    }
}
