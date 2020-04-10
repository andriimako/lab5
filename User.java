public class User {
    public  String name;
    public String lastname;
    public String Email;
    public String password;

    User(String x, String y, String z, String t)
    {
        this.name = x;
        this.lastname = y;
        this.Email = z;
        this.password =  t;
    }

    User(String e)
    {
        this.name = "guest";
        this.lastname = "guest";
        this.Email = e;
        this.password = null;
    }

    User(User c, String n, String l, String p)
    {
        this.name = n;
        this.lastname = l;
        this.Email = c.Email;
        this.password = p;
    }


}

