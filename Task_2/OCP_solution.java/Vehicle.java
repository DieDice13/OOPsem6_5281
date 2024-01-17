class Vehicle {
    int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double calculateAllowedSpeed() {
        return 0;
    }
}

class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}





