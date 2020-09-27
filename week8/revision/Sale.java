package week8.revision;

public class Sale {
    private int price;
    private String productName;

    public Sale(){
    }

    public Sale(int price, String productName){
        this.productName = productName;
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public double getActualPrice() {
        return (double) price;
    }

    @Override
    public String toString() {
        return "product_name: " + productName + " price: " + price;
    }



    public static void main(String[] args) {
        Sale product = new Sale();
    }
}
