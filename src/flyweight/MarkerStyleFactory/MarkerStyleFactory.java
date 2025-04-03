package flyweight;
import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "_" + color + "_" + labelStyle;
        if (!styles.containsKey(key)) {
            MarkerStyle style = new MarkerStyle(icon, color, labelStyle);
            styles.put(key, style);
            System.out.println("Создан новый стиль маркера: " + style);
        }
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}

