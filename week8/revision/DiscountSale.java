package week8.revision;

public class DiscountSale extends Sale{
    private double discount;

    public DiscountSale(int price, String productName, double discount){
        super(price,productName);
        this.discount = discount;
    }

    public double getActualPrice() {
        return getPrice()*discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    //overload
    //override
    public String toString(){
        return super.toString()+ " discount: "+discount;
    }

    public static void main(String[] args) {
        DiscountSale discountSale = new DiscountSale(10,"noteBook",0.8);
        System.out.println(discountSale);
    }
}
