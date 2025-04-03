package proxy;

public class ImageProxy implements Image {
    protected String filename;
    protected RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public ImageProxy() {

    }

    @Override
    public void displayThumbnail() {
        System.out.println("Отображение миниатюры (низкое разрешение): " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}

