public abstract class Details {
    private String modelName;
    private String producer;
    private String serialNumber;

    public Details(String modelName, String producer, String serialNumber) {
        this.modelName = modelName;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

}
