package t1q4;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;
    
    //Constructor
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void accelerate();

    double getCurrentSpeed() {
        return currentSpeed;
    }

    double getMaxSpeed() {
        return maxSpeed;
    }

    void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}
