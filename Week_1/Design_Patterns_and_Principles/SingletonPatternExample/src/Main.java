public class Main {
    public static void main(String[] args) {
       
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");


        Logger logger2 = Logger.getInstance();
        logger2.log("Processing user request");


        if (logger1 == logger2) {
            System.out.println("Singleton verified: Only one Logger instance is in use.");
        } else {
            System.out.println("Error: Multiple Logger instances exist!");
        }
    }
}
