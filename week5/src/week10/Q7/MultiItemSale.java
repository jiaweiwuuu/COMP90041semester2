package week10.Q7;

/**
 * MultiItemSale.java
 * <p>
 * <p>
 * Created: Tue Jan 13 20:07:29 2004
 *
 * @author Adrienne Decker
 */

public class MultiItemSale {
    private Sale[] sales;
    private int curr;

    public MultiItemSale() {
        this.sales = new Sale[10];
        this.curr = 0;
    }

    public void insertSale(Sale insert) {
        if (this.curr > this.sales.length) {
            this.resize();
        } // end of if ()
        this.sales[this.curr] = insert;
        this.curr++;
    }

    public void resize() {
        int currSize = this.sales.length;
        currSize *= 2;

        Sale[] newSales = new Sale[currSize];
        for (int i = 0; i < this.curr; i++) {
            newSales[i] = this.sales[i];
        } // end of for ()

        this.sales = newSales;
    }

    public Sale getSale(int index) {
        return this.sales[index];
    }

    public double computeTotal() {
        double result = 0.0;
        for (int i = 0; i < this.curr; i++) {
            result = result + this.sales[i].bill();
        } // end of for ()

        return result;
    }

    //Students should be encouraged to write an equals, and
    // clone method for completeness
    public String toString() {
        String result = "";
        for (int i = 0; i < this.curr; i++) {
            result += this.sales[i] + "\n";
        } // end of for ()
        return result;
    }
}// MultiItemSale