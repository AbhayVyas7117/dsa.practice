package Inheritance;
// using overriding method using inheritance concept in java.

class DeliveryPartner {

    void time() {
        System.out.println("Essitimate time:");
    }
}

class BikeDelivery extends DeliveryPartner {

    @Override
    void time() {
        System.out.println("Bike essitimate time is 15 minute");
    }
}

class DroneDelivery extends DeliveryPartner {

    @Override
    void time() {
        System.out.println("Drone essitimate time is 5 minute");
    }
}

public class Delivery {

    public static void main(String[] args) {
        DeliveryPartner dp = new DeliveryPartner();
        BikeDelivery bd = new BikeDelivery();
        DroneDelivery dd = new DroneDelivery();
        dp.time();
        bd.time();
        dd.time();
    }
}
