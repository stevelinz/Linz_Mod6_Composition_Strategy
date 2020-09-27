package strategy;

public class SalesDiscount implements DiscountStrategy {

    private double bill;

    public SalesDiscount(double bill){this.bill=bill;}

    @Override
    // tempBill = billAmount - (billAmount * 0.1);
    public double customerBillamount(double originalAmount) {
        return originalAmount - (originalAmount* 0.1);
    }
}
