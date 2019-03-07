public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(23));
        System.out.println(area(12, 12));
    }
    public static double area(double radius){
        if(radius<0) {
            return -1.0;
        }
        double areaofCircle;
        double Pi=Math.PI;
        return areaofCircle= (radius*radius)*Pi;
        }


    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;

        }
        double areaofRectangle;
        return areaofRectangle=x*y ;
    }
}
