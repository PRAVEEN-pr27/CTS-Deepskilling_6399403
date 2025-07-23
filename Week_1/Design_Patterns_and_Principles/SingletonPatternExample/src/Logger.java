public class Logger {

    // Private static instance (eager loading or lazy loading can be used — here it's lazy)
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to provide global access point (lazy initialization)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to log a message
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
