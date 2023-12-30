public class Area {
    Shape s1 = new Shape();
    void rectangleArea(double length,double width){
        System.out.println(s1.rectangleArea(length,width));
    }
    void squareArea(double side){
        System.out.println(s1.squareArea(side));
    }
    void circleArea(double radius ){
        System.out.println(s1.circleArea(radius));
    }
}
