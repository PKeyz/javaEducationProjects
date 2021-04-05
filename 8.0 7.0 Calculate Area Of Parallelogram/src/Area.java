public class Area {
 // vars for constructor
    double area;
    double h;
    double w;
//constructor
    public Area(double h, double w){
        this.area = h * w;
    }
    public double calculateArea(){
        return area;
    }
}
