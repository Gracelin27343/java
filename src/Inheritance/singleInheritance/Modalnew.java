package Inheritance.singleInheritance;

public class Modalnew  extends Car {
    public boolean centerLocking;
    public boolean powerWindow;

    public Modalnew(int wheels, String colors, String steering, boolean centerLocking, boolean powerWindow) {
        super (wheels, colors, steering);
        this.centerLocking = centerLocking;
        this.powerWindow = powerWindow;
    }

    public void controlCenterLocking() {}
    public void controlPowerWindow() {}
}
