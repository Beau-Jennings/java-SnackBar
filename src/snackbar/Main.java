package snackBar;

public class Main 
    {
        public static void main(String[] args) 
        {
            workWithData();
        }

        private static void workWithData()
        {
            VendingMachine vm1 = new VendingMachine("Food");
            VendingMachine vm2 = new VendingMachine("Drinks");
            VendingMachine vm3 = new VendingMachine("Office");
        
            Snack s1 = new Snack(vm1.id, "Chips", 36, 1.00);
            Snack s2 = new Snack(vm1.id, "Chocolate bars", 36, 1.25);
            Snack s3 = new Snack(vm1.id, "Pretzel", 30, 1.50);
            Snack s4 = new Snack(vm1.id, "Soda", 24, 2.50);
            Snack s5 = new Snack(vm1.id, "Water", 20, 1.00);

            Customer c1 = new Customer("Jane", 45.25);
            Customer c2 = new Customer("Bob", 33.14);

            System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
            System.out.println("Quantity of " + s1.getName() + " is " + s1.getQuantity());
        }
    }
