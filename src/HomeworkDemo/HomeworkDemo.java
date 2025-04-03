import flyweight.MapMarker;
import flyweight.MarkerStyleFactory;
import model.User;
import proxy.ProtectedImageProxy;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDemo {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===");
        User agent = new User("agent007", true);
        ProtectedImageProxy imageProxy = new ProtectedImageProxy("property1.jpg", agent);
        imageProxy.displayThumbnail();
        imageProxy.displayFullImage();
        imageProxy.uploadImage("property1_new.jpg");
        imageProxy.displayThumbnail();
        imageProxy.displayFullImage();

        System.out.println("\n=== Flyweight Pattern Demo ===");
        List<MapMarker> markers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String icon, color, labelStyle;
            if (i % 3 == 0) {
                icon = "hospital";
                color = "red";
                labelStyle = "bold";
            } else if (i % 3 == 1) {
                icon = "restaurant";
                color = "blue";
                labelStyle = "italic";
            } else {
                icon = "gas_station";
                color = "green";
                labelStyle = "normal";
            }
            markers.add(new MapMarker(i, i, icon, color, labelStyle));
        }
        System.out.println("Всего маркеров: " + markers.size());
        System.out.println("Уникальных стилей: " + MarkerStyleFactory.getTotalStyles());
    }
}
