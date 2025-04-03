package flyweight;
public class MapMarker {
    private final int x;
    private final int y;
    private final MarkerStyle style;

    public MapMarker(int x, int y, String icon, String color, String labelStyle) {
        this.x = x;
        this.y = y;
        this.style = MarkerStyleFactory.getStyle(icon, color, labelStyle);
    }

    public void display() {
        System.out.println("Маркeр в точке (" + x + ", " + y + ") с стилем [" + style + "]");
    }
}
