public class Display{
    private double sizeInches;
    private String resolution;
    private boolean isOn = false;

    public Display(double sizeInches, String resolution){
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    public String turnOn(){
        isOn = true;
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }

    public String turnOff(){
        isOn = false;
        return "Display turned off.";
    }

    public boolean isOn(){
        return isOn;
    }

    public double getSizeInches(){
        return this.sizeInches;
    }

    public String getResolution(){
        return this.resolution;
    }

    public String toString(){
        return "Display: " + this.sizeInches + " inches, " + this.resolution;
    }
}
