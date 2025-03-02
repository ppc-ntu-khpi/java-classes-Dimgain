
package domain;

public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000;
    
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("New customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
    
    // Конструктор за замовчуванням
    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }
    
    // Гетери та сетери
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }
    }
    
    public boolean isIsNew() {
        return isNew;
    }
    
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        }
    }
}
