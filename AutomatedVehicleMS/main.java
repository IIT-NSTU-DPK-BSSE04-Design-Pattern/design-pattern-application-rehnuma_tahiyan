// Vehicle Interface
interface Vehicle {
    void assemble();
    void displayFeatures();
}

// Abstract Factory for Vehicle Creation
interface VehicleFactory {
    Vehicle createVehicle();
}

// Car Class
class Car implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling Car with body, 4 wheels, and car engine.");
    }

    @Override
    public void displayFeatures() {
        System.out.println("Car: Compact body, 4 wheels, and comfortable seats.");
    }
}

// Truck Class
class Truck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling Truck with larger body, 6 wheels, and a strong engine.");
    }

    @Override
    public void displayFeatures() {
        System.out.println("Truck: Large cargo bed, strong engine, and heavy-duty wheels.");
    }
}

// Motorcycle Class
class Motorcycle implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling Motorcycle with a compact body, 2 wheels, and a small engine.");
    }

    @Override
    public void displayFeatures() {
        System.out.println("Motorcycle: Lightweight body, 2 wheels, and high fuel efficiency.");
    }
}

// Car Factory
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// Truck Factory
class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

// Motorcycle Factory
class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

// Main Class to Simulate the System
public class main {
    public static void main(String[] args) {
        // Order a car
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.assemble();
        car.displayFeatures();

        // Order a truck
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.assemble();
        truck.displayFeatures();

        // Order a motorcycle
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.assemble();
        motorcycle.displayFeatures();
    }
}