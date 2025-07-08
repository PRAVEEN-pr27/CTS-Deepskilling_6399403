public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy loading
        } else {
            System.out.println("Image loaded from cache: " + fileName);
        }
        realImage.display();
    }
}
