package org.example;

public class InventoryService {
    public boolean checkStock(String prodId){
        System.out.println("Checking Stock"+prodId);
        return true;
    }
    public void updateStock(String product){
        System.out.println("Updating Stock"+product);
    }
}
