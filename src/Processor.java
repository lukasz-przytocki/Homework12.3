public class Processor extends Details{
    private int clockSpeed;
    private double temperature;
    private int maxTemperature;

    public Processor(String modelName, String producer, String serialNumber, int clockSpeed, double temperature, int maxTemperature) {
        super(modelName, producer, serialNumber);
        this.clockSpeed = clockSpeed;
        if (temperature<maxTemperature) {
            this.temperature = temperature;
        }else {
            throw new IllegalArgumentException("Processor temperature exceeds maximum temperature.");
        }
        this.maxTemperature = maxTemperature;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    void speedUp(int extraSpeed) {
        if((temperature+((extraSpeed/100)*10))<maxTemperature) {
            temperature+=((extraSpeed/100)*10);
            clockSpeed += extraSpeed;
        }else {
            throw new ExceededMaximumTemperaature("Requested speed update might damage processor by overheating.");
        }
    }
}
