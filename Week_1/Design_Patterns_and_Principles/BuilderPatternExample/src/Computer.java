public class Computer {

    // Required specs
    private String processor;
    private String memory;

    // Optional specs
    private String storage;
    private String graphics;
    private String wifi;

    // Private constructor (only accessible via Builder)
    private Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.storage = builder.storage;
        this.graphics = builder.graphics;
        this.wifi = builder.wifi;
    }

    // Display computer configuration
    public void showConfiguration() {
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + (storage != null ? storage : "N/A"));
        System.out.println("Graphics: " + (graphics != null ? graphics : "N/A"));
        System.out.println("Wi-Fi: " + (wifi != null ? wifi : "N/A"));
        System.out.println("-------------------------------------------------");
    }

    // Static inner Builder class
    public static class ComputerBuilder {
        private String processor;
        private String memory;
        private String storage;
        private String graphics;
        private String wifi;

        public ComputerBuilder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }

        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public ComputerBuilder withWiFi(String wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
