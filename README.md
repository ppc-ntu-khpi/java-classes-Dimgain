
# Лабораторна робота 2: Створення класів 🧪

Ця лабораторна робота присвячена створенню класів та роботі з об'єктами в Java. Завдання було виконано відповідно до вимог, з реалізацією класу `Customer` та тестового класу `CustomerTest`.

## Завдання 1: Створення класу з атрибутами ✅

Було створено клас `Customer` у пакеті `domain` з такими приватними атрибутами:
* `ID` (ціле число) - ідентифікатор клієнта
* `isNew` (булеве значення) - статус клієнта
* `total` (дробове число) - сума замовлень

Всі атрибути мають значення за замовчуванням:
* `ID = 1`
* `isNew = true`
* `total = 1000`

## Завдання 2: Додавання методів у клас ✅

До класу `Customer` було додано метод `displayCustomerInfo()`, який виводить інформацію про клієнта в консоль:

```java
public void displayCustomerInfo() {
    System.out.println("Customer ID: " + ID);
    System.out.println("New customer: " + isNew);
    System.out.println("Total purchases are: " + total);
}
```

## Реалізація для оцінки "5" 🌟

Додатково було реалізовано:

1. **Конструктор за замовчуванням**:
```java
public Customer() {
    this.ID = 1;
    this.isNew = true;
    this.total = 1000;
}
```

2. **Методи для зміни атрибутів (сетери) та отримання значень (гетери)**:
```java
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
```

## Повна реалізація класу Customer 📋

```java
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
```

## Тестовий клас CustomerTest 🧪

Для перевірки функціональності класу `Customer` був створений тестовий клас `CustomerTest`:

```java
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
```

## Результати роботи програми 📊

Після запуску програми отримуємо такий вивід:

```
Initial values:
Customer ID: 1
New customer: true
Total purchases are: 1000.0

Updated values:
Customer ID: 2
New customer: false
Total purchases are: 2500.5
```

## Висновки 📝

У ході виконання лабораторної роботи було створено клас `Customer` з приватними атрибутами, методами для роботи з ними та тестовий клас для перевірки роботи. Додатково було реалізовано функціонал на оцінку "5", що включає конструктор за замовчуванням та методи для зміни атрибутів.
