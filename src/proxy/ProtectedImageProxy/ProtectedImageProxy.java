package proxy;

import model.User;

public class ProtectedImageProxy extends ImageProxy {
    private final User user;

    public ProtectedImageProxy(String filename, User user) {
        super(filename);
        this.user = user;
    }

    public ProtectedImageProxy(String image, User agent, User user) {
        super();
        this.user = user;
    }

    public void uploadImage(String newFilename) {
        if (!user.isLoggedIn()) {
            System.out.println("Ошибка: Пользователь " + user.getUsername() + " не авторизован для загрузки изображений!");
            return;
        }
        System.out.println("Загрузка нового изображения: " + newFilename + " от пользователя " + user.getUsername());
        this.filename = newFilename;
        this.realImage = null;
    }
}

