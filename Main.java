import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Product p = new Product("compA", 20.0);
        Product p2 = new Product("compB", 30.0);
        Product p3 = new Product("compC", 35.0);
        Product p4 = new Product("lol", 2000);

        ArrayList<Product> products2 = new ArrayList<>(Arrays.asList(p, p2));
        ArrayList<Product> products3 = new ArrayList<>(Arrays.asList(p4));

        Category c = new Category("shalom, ani lo medober java");
        Category c2 = new Category("lol", products2);
        Category c3 = new Category();

        c.addProduct(p);
        c.addProduct(p2);
        c.addProduct(p3);


        if (c.checkIfExists(p4)) {
            System.out.println("da, ken");
        } else
            System.out.println("lo, it doesnt");
        if (c.checkIfExists(p)) {
            System.out.println("da, ken");
        }
    }
}
