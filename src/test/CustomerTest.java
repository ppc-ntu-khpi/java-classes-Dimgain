
package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Customer
        Customer customer = new Customer();
        
        // Виводимо початкові значення
        System.out.println("Initial values:");
        customer.displayCustomerInfo();
        
        // Змінюємо значення атрибутів
        customer.setID(2);
        customer.setIsNew(false);
        customer.setTotal(2500.50);
        
        // Виводимо змінені значення
        System.out.println("\nUpdated values:");
        customer.displayCustomerInfo();
    }
}
