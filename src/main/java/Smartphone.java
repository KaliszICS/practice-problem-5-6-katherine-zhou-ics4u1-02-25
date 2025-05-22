public class Smartphone{
    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor){
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed){
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    public String powerOn(){
        if (this.battery.isCharged()){
            return this.display.turnOn() + "\nPowering on " + this.brand + " " + this.model;
        }
        return "Cannot power on: Battery depleted";
    }

    public String powerOff(){
        return this.display.turnOff() + "\nPowering off " + this.brand + " " + this.model;
    }

    public void chargeBattery(){
        this.battery.charge();
    }

    public String runApp(String appName){
        if (this.display.isOn()){
            return this.processor.processTask(appName) + "\n" + appName + " running.";
        }
        return "Phone is off. Cannot run " + appName;
    }

    public void upgradeComponent(Battery newBattery){
        this.battery = newBattery;
    }

    public void upgradeComponent(Display newDisplay){
        this.display = newDisplay;
    }

    public void upgradeComponent(Processor newProcessor){
        this.processor = newProcessor;
    }

    public String toString(){
        return this.brand + " " + this.model + " Smartphone\n" +
               this.battery.toString() + "\n" +
               this.display.toString() + "\n" +
               this.processor.toString();
    }
}
