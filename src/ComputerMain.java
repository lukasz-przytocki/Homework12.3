public class ComputerMain {
    public static void main(String[] args) {
        Processor processor = new Processor("I5","Intel", "AAH5200", 1600, 60, 100);
        Memory memory = new Memory("L6000", "Kingstone", "AKA1600", 8000,4000, 20, 80 );
        HardDrive hardDrive = new HardDrive("S600","Samsung", "S300", 256000);

        try{
            processor.speedUp(400);
        }catch (ExceededMaximumTemperaature e){
            System.out.println(e.getMessage());
        }

        try{
            memory.speedUp(1000);
        }catch (ExceededMaximumTemperaature e){
            System.out.println(e.getMessage());
        }

        System.out.println("Processor speed: "+processor.getClockSpeed());
        System.out.println("Processor temperature: "+processor.getTemperature());

        System.out.println("Memory speed: "+memory.getMemSpeed());
        System.out.println("Memory temperature: "+memory.getMemTemp());


    }

}
