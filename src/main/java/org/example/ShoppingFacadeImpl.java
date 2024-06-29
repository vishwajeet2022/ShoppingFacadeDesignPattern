package org.example;

public class ShoppingFacadeImpl {
    private InventoryService inventoryService;
    private NotificationService notificationService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    ShoppingFacadeImpl(){
        this.inventoryService = new InventoryService();
        this.notificationService = new NotificationService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }
    public void order(String  prodId, int amount){
        if(inventoryService.checkStock(prodId)){
            notificationService.sendNotification("Product order");
            paymentService.processPayment(100);
            shippingService.shipProduct("Order shipped");
        }
    }
}
