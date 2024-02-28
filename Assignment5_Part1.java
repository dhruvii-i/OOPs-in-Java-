
package Part1;

public class Assignment5_Part1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circle c = new Circle(7);
        System.out.println("Area of Circle is : " + c.calculateArea());
        System.out.println("Perimenter of Circle is : " + c.calculatePerimeter());

        System.out.println("\n");

        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of Triangle is : " + t.calculateArea());
        System.out.println("Perimenter of Triangle is : " + t.calculatePerimeter());

        System.out.println("\n");

        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of Reactangle is : " + r.calculateArea());
        System.out.println("Perimenter of Reactangle is : " + r.calculatePerimeter());

    }

}