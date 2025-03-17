class InterfaceAndAbstractClass {
    
    public static void main(String[] args) {
        
        AutomaticCar autoCar = new AutomaticCar("Automatic Car");
        ManualCar manCar = new ManualCar("Manual Car");

        autoCar.accelarate();
        autoCar.brake();
        autoCar.shiftGear();
        autoCar.printVehicleInfo();

        System.out.println();

        manCar.accelarate();
        manCar.shiftGear();
        manCar.brake();
        manCar.printVehicleInfo();

    }
}

interface VehicleInfo {

    void printVehicleInfo();
}

abstract class Vehicle{

    private String type;

    Vehicle(String type){
        this.type = type;
    }

    void accelarate(){
        System.out.println(type+" is accelerating");   
    }

    void brake(){
        System.out.println(type+" is breaking");   
    }

    abstract void shiftGear();
    
}

class AutomaticCar extends Vehicle implements VehicleInfo{

    AutomaticCar(String type){
        super(type);
    }

    void shiftGear(){
        System.out.println("Automatically Shifting Gear");
    }

    public void printVehicleInfo(){
        System.out.println("This is Automatic Car");
    }
}

class ManualCar extends Vehicle{

    ManualCar(String type){
        super(type);
    }

    void shiftGear(){
        System.out.println("Manually Shifting Gear");
    }

    public void printVehicleInfo(){
        System.out.println("This is Manual Car");
    }
}