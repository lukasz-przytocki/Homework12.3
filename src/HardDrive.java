public class HardDrive extends Details{
    private int hdSize;

    public HardDrive(String modelName, String producer, String serialNumber, int hdSize) {
        super(modelName, producer, serialNumber);
        this.hdSize = hdSize;
    }
}
