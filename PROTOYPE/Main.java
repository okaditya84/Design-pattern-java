import java.util.HashMap;
import java.util.Map;

// Abstract class for transportation vehicles
abstract class Vehicle implements Cloneable {
    protected String type;
    protected String color;

    public abstract void getInfo();
    
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

// Concrete class for buses
class Bus extends Vehicle {
    private int capacity;

    public Bus(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
        this.type = "Bus";
    }

    public void getInfo() {
        System.out.println("This is a " + color + " " + type + " with a capacity of " + capacity + " passengers.");
    }
}

// Concrete class for trains
class Train extends Vehicle {
    private int numCars;

    public Train(int numCars, String color) {
        this.numCars = numCars;
        this.color = color;
        this.type = "Train";
    }

    public void getInfo() {
        System.out.println("This is a " + color + " " + type + " with " + numCars + " cars.");
    }
}

// Class for managing prototypes
class VehicleManager {
    private static Map<String, Vehicle> vehicleMap = new HashMap<>();

    public static void loadPrototypes() {
        Bus bus = new Bus(50, "red");
        Train train = new Train(5, "blue");

        vehicleMap.put("Bus", bus);
        vehicleMap.put("Train", train);
    }

    public static Vehicle getVehicle(String type) {
        Vehicle vehicle = vehicleMap.get(type);
        return (Vehicle) vehicle.clone();
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        VehicleManager.loadPrototypes();

        Vehicle bus1 = VehicleManager.getVehicle("Bus");
        bus1.getInfo();

        Vehicle train1 = VehicleManager.getVehicle("Train");
        train1.getInfo();

        // Clone a bus
        Bus bus2 = (Bus) VehicleManager.getVehicle("Bus");
        bus2.capacity = 40;
        System.out.print("Cloned bus: ");
        bus2.getInfo();
        
        // Demonstrate deep clone
        Bus bus3 = (Bus) VehicleManager.getVehicle("Bus");
        bus3.color = "green";
        System.out.print("Original bus: ");
        bus1.getInfo();
        System.out.print("Changed clone: ");
        bus3.getInfo();
    }
}
