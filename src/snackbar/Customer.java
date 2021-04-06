package snackBar;

public class Customer 
{
    private static int maxId = 0;
    public int id;
    public String name;
    public double cashOnhand;

    public Customer(String name, double cashOnhand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnhand = cashOnhand;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnhand;
    }

    public void setBuySnack(double cashOnhand, double cost)
    {
        this.cashOnhand = this.cashOnhand - cost;
    }
}
