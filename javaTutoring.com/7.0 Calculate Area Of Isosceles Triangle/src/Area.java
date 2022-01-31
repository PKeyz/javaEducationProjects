public class Area {

    double a;
    double b;
    double area;

    public Area(double a, double b) {
        this.a = a;
        this.b = b;
        this.area = b/4 * Math.sqrt((4 * a * a ) - ( b * b ));

    }

}
