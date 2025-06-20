public class Main {
    public static void main(String[] args) {

        // Basic computer
        Computer basic = new Computer.ComputerBuilder("Ryzen 3", "8GB")
                .build();

        // Developer workstation
        Computer developerPC = new Computer.ComputerBuilder("Intel i7", "16GB")
                .withStorage("1TB SSD")
                .withWiFi("Intel AX210")
                .build();

        // Gaming setup
        Computer gaming = new Computer.ComputerBuilder("Intel i9", "32GB")
                .withStorage("2TB SSD")
                .withGraphics("NVIDIA RTX 4090")
                .withWiFi("TP-Link Dual Band")
                .build();

        System.out.println("Basic Configuration:");
        basic.showConfiguration();

        System.out.println("Developer PC Configuration:");
        developerPC.showConfiguration();

        System.out.println("Gaming Configuration:");
        gaming.showConfiguration();
    }
}
