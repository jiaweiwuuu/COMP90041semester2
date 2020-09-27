package week8.revision;

public class MultiItemSale {
    Sale[] shoppingCart = new Sale[100];
    private int count;

    public void addProducts(Sale sale){
        shoppingCart[count] = sale;
        count++;
    }

    public double calculateBill(){
        double result = 0;
        for(int i =0; i < count; i++){
            result += shoppingCart[i].getActualPrice();
        }
        return result;
    }

    public static void main(String[] args) {
        MultiItemSale multiItemSale = new MultiItemSale();
        multiItemSale.addProducts(new Sale(10,"NoteBook"));
        multiItemSale.addProducts(new DiscountSale(10,"CheapNoteBook",0.8));
        System.out.println(multiItemSale.calculateBill());
    }
}
