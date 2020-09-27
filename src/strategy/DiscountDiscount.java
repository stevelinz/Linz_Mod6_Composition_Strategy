package strategy;

public class DiscountDiscount implements DiscountStrategy{

    private double bill;

    public DiscountDiscount(double bill){this.bill=bill;}

    @Override
    //tempBill = billAmount - (billAmount * 0.5);
    public double customerBillamount(double originalAmount) {
        return originalAmount * 0.5;
    }
}
