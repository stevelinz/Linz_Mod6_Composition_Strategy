package strategy;

public class LiquidDiscount implements DiscountStrategy {

    private double bill;

    public LiquidDiscount(double bill){this.bill=bill;}

    @Override
    //tempBill = billAmount - (billAmount * 0.75);
    public double customerBillamount(double originalAmount) {
        return originalAmount - (originalAmount * 0.75);
    }
}
