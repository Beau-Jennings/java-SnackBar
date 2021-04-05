package snackbar;

public class Snack 
{
    private int id;
    private static int maxId = 1;
    private int vendingMachineId;

    private String name;
    private int quantity;
    private double cost;


    public Snack (int vendingMachineId, String name, int quantity, double cost)
    {
        id = maxId++;
        this.vendingMachineId = vendingMachineId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getId()
    {
        return id;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setAddQuantity()
    {
        this.quantity = quantity - this.quantity;
    }

    public void setBuySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setTotalCost(double cost, int quantity)
    {
        this.cost = cost * quantity;
    }
}
