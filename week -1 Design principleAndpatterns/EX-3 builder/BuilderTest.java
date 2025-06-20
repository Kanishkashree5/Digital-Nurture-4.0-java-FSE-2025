public class BuilderTest {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();

        basicComputer.showSpecs();

        System.out.println();

        // Gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("NVIDIA RTX 4080")
                .setWifi(true)
                .setBluetooth(true)
                .build();

        gamingComputer.showSpecs();
    }
}
