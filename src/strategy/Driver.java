package strategy;


public class Driver {
    public static void main(String[] args) { new Driver().run();}

    public void run(){

//        //Discount types S for Sale, D for Discount, L for Liquidation
//        orders.add(new CustomerOrder("William Walters", 75.34, 'D'));
//        orders.add(new CustomerOrder("Susan Smothers", 24.12, 's'));
//        orders.add(new CustomerOrder("Jessica Johnson", 273.93, 'L'));
//        orders.add(new CustomerOrder("Richard Ricardo", 171.42, 'D'));

        double total = 0.0;

        System.out.println();
        Customer customer1 = new Customer(75.34);
        customer1.setCustomerName("William Walters");
        customer1.setDiscountStrategy(new DiscountDiscount(customer1.getOriginalAmount()));
        customer1.customerBillamount();
        System.out.print(customer1.getCustomerName()+"\t\t");
        System.out.printf("%-1s $%1.2f", " ", customer1.getOriginalAmount());
        System.out.println();
        total = total + customer1.getOriginalAmount();

        Customer customer2 = new Customer(24.12);
        customer2.setCustomerName("Susan Smothers");
        customer2.setDiscountStrategy(new SalesDiscount(customer2.getOriginalAmount()));
        customer2.customerBillamount();
        System.out.print(customer2.getCustomerName()+"\t\t");
        System.out.printf("%-1s $%1.2f", " ", customer2.getOriginalAmount());
        System.out.println();
        total = total + customer2.getOriginalAmount();

        Customer customer3 = new Customer(273.93);
        customer3.setCustomerName("Jessica Johnson");
        customer3.setDiscountStrategy(new LiquidDiscount(customer3.getOriginalAmount()));
        customer3.customerBillamount();
        System.out.print(customer3.getCustomerName()+"\t\t");
        System.out.printf("%-1s $%1.2f", " ", customer3.getOriginalAmount());
        System.out.println();
        total = total + customer3.getOriginalAmount();

        Customer customer4 = new Customer(171.42);
        customer4.setCustomerName("Richard Ricardo");
        customer4.setDiscountStrategy(new DiscountDiscount(customer4.getOriginalAmount()));
        customer4.customerBillamount();
        System.out.print(customer4.getCustomerName()+"\t\t");
        System.out.printf("%-1s $%1.2f", " ", customer4.getOriginalAmount());
        System.out.println();
        total = total + customer4.getOriginalAmount();


        System.out.println();
        System.out.printf("%-1s $%1.2f", "\t\tTotal:\t\t",total);
        System.out.println();


   }

}

