// Super Class
public class Vehicle {
    void calRent(int distance, float price){
        float fare=distance * price;
        System.out.println("vehicle price = "+fare);
    }
}

// Sub Class
public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}

public class Bus extends Vehicle {
    
}

// Main Class
public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
