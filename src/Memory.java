public class Memory extends Details{
    private int memSize;
    private int memSpeed;
    private int memTemp;
    private int memMaxTemp;

    public Memory(String modelName, String producer, String serialNumber, int memSize, int memSpeed, int memDefTemp, int memMaxTemp) {
        super(modelName, producer, serialNumber);
        this.memSize = memSize;
        this.memSpeed = memSpeed;
        if(memDefTemp<memMaxTemp) {
            this.memTemp = memDefTemp;
        }else {
            throw new IllegalArgumentException("Memory temperature exceeds maximum temperature.");
        }
        this.memMaxTemp = memMaxTemp;
    }

    public int getMemSize() {
        return memSize;
    }

    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }

    public int getMemSpeed() {
        return memSpeed;
    }

    public void setMemSpeed(int memSpeed) {
        this.memSpeed = memSpeed;
    }

    public int getMemTemp() {
        return memTemp;
    }

    public void setMemTemp(int memTemp) {
        this.memTemp = memTemp;
    }

    public int getMemMaxTemp() {
        return memMaxTemp;
    }

    public void setMemMaxTemp(int memMaxTemp) {
        this.memMaxTemp = memMaxTemp;
    }

    void speedUp(int extraSpeed) {
        if((memTemp+((extraSpeed/100)*15))<memMaxTemp) {
            memTemp+=((extraSpeed/100)*15);
            memSpeed += extraSpeed;
        }else {
            throw new ExceededMaximumTemperaature("Requested speed update might damage memory by overheating");
        }
    }
}
