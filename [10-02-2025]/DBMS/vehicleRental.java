import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    protected String brand, model, licensePlate;
    protected boolean isAvailable;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.isAvailable = true;
    }

    public abstract void displayInfo();

    public boolean rent() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " rented.");
            return true;
        }
        System.out.println(model + " is not available.");
        return false;
    }

    public void returnVehicle() {
        isAvailable = true;
        System.out.println(model + " returned.");
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    public Car(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " | License: " + licensePlate + " | Available: " + isAvailable);
    }
}

// Bike class extending Vehicle
class Bike extends Vehicle {
    public Bike(String brand, String model, String licensePlate) {
        super(brand, model, licensePlate);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike: " + brand + " " + model + " | License: " + licensePlate + " | Available: " + isAvailable);
    }
}

// Rental System class
class RentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.model + " added.");
    }

    public void displayAvailableVehicles() {
        for (Vehicle v : vehicles) {
            if (v.isAvailable) v.displayInfo();
        }
    }

    public Vehicle rentVehicle(String model) {
        for (Vehicle v : vehicles) {
            if (v.model.equalsIgnoreCase(model) && v.isAvailable) {
                v.rent();
                return v;
            }
        }
        System.out.println("Vehicle not available.");
        return null;
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        rentalSystem.addVehicle(new Car("Toyota", "Corolla", "ABC123"));
        rentalSystem.addVehicle(new Bike("Yamaha", "R15", "XYZ456"));

        System.out.println("\nAvailable Vehicles:");
        rentalSystem.displayAvailableVehicles();

        Vehicle rented = rentalSystem.rentVehicle("Corolla");

        System.out.println("\nAfter Renting:");
        rentalSystem.displayAvailableVehicles();

        if (rented != null) rented.returnVehicle();

        System.out.println("\nAfter Returning:");
        rentalSystem.displayAvailableVehicles();
    }
}
