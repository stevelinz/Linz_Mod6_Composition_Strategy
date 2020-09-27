package strategy;

public class Customer {

    private String customerName;
    private double originalAmount = 0.0;

    private DiscountStrategy discountStrategy;

    ////////////////////added

    public Customer(String customerName) {
        this.customerName = customerName;
    }


    ///////////////////////////////////

    public Customer(double originalAmount) {
                this.originalAmount = originalAmount;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public void customerBillamount(){
        if(discountStrategy != null){
            originalAmount = discountStrategy.customerBillamount(originalAmount);

        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

//    public double getOriginalAmount() {
//        return originalAmount;
//    }
//
//    public void setOriginalAmount(double originalAmount) {
//        this.originalAmount = originalAmount;
//    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
