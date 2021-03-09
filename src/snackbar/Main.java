package snackbar;

public class Main
{
    public static void main(String[] args)
    {
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drinks");
        VendingMachine vm3 = new VendingMachine("Office");
        
        Snack s1 = new Snack("Chips", 36, 1.00, vm1.id);
        Snack s2 = new Snack("Chocolate bars", 36, 1.25, vm1.id);
        Snack s3 = new Snack("Pretzel", 30, 1.50, vm1.id);
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.id);
        Snack s5 = new Snack("Water", 20, 1.00, vm2.id);

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);


        
        System.out.println("*** Query Data");
        // System.out.println(c1.name + " " + c1.cashOnhand);
        // System.out.println(s3.getQuantity() + " " +  s3.getName());
        System.out.println(c1.name + " buys " + s4.getQuantity() + " " + s4.getName());

    }
}