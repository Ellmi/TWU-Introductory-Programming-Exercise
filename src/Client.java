/**
 * Created by ymxing on 2/20/15.
 */
public class Client {
    public static void main(String args[]){
        testTriangle();
    }

    private static void testTriangle() {
        System.out.println("-------test Triangle Exercise------");
        Triangle triangleTest = new Triangle();
        System.out.println("test the method PrintOneAsterisk:");
        triangleTest.PrintOneAsterisk();
        System.out.println("test the method DrawAHorizontalLine:");
        triangleTest.DrawAHorizontalLine(5);
        System.out.println("test the method DrawAVerticalLine:");
        triangleTest.DrawAVerticalLine(3);
        System.out.println("test the method DrawARightTriangle:");
        triangleTest.DrawARightTriangle(6);
    }
}
