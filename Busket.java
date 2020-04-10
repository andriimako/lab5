public class Busket {
    User user;
    Product[] products;

    public Busket() {};

    public Busket(User user)
    {
        this.user = user;
    }

    public Busket(User user, Product[] products)
    {
        this.user = user;
        this.products = products;
    }

    public void add(Product product)
    {
        boolean t = true;
        for(int i= 0; i< products.length; i++)
        {
            if (products[i] == null)
            {
                t = false;
                products[i] = product;
                break;
            }
            if (t == true) System.out.println("There iz no zpave in Zhop.");
        }

    }

    public void remove(Product product)
    {
        boolean t = false;
        for(int i = 0; i < products.length; i++) {
            if (products[i] == product) products[i] = null;
            t = true;
        }
        if (t== false) System.out.println("There iz no Produvt "+ product +" in the Zhop.");
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public void buy()
    {
        double total = 0;
        for(int i = 0; i<products.length; i++) {
            total += products[i].getPrice();
        }
        System.out.println(total);
    }
}
