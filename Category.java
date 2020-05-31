import java.util.ArrayList;

public class Category {

    String name;
    private ArrayList<Product> products;

    public Category () {
        this.name = "Main";
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public int getNumberOfProducts(){
        return products.size();
    }

    public void addProduct(Product newProduct) throws Exception {
        if(checkIfExists(newProduct)){
           throw new Exception("the product already exists");
        }
        products.add(newProduct);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean checkIfExists(Product product){
        for(Product p : products){
            if(p.getName().equals(product.getName())){
                return true;
            }
        }
        return false;
    }
}
