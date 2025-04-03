package proxy;
public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка полноразмерного изображения с диска: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Отображение миниатюры (выведено из полноразмерного изображения): " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Отображение полноразмерного изображения: " + filename);
    }
}

