public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0 , "red" , true);
        System.out.println(circle);
        double area = circle.getArea();
        System.out.println("The area of the circle is " + area);

        Square square = new Square(5.0);
        System.out.println("area of square is "+square.getArea());


        square.setWidth(6);
        System.out.println(square.getArea());
    }
}





