public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("dog.jpg");
        Image image2 = new ProxyImage("cat.jpg");

        System.out.println("First time viewing dog.jpg:");
        image1.display();

        System.out.println("\nViewing cat.jpg:");
        image2.display();

        System.out.println("\nViewing dog.jpg again:");
        image1.display();
    }
}
