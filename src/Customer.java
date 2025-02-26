package test;

public class Customer{
    int ID = 1;
    boolean isNew = true;
    float total = 1000;

    public void displayCustomerInfo(){
        System.out.println("ID: " + ID);
        System.out.println("isNew: " + isNew);
        System.out.println("total: " + total);
    }
}