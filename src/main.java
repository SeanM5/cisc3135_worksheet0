/**
 * Created by seanmcintyre on 9/5/18.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {


    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Name a Square");
        String squareName = br.readLine();
        Square s = new Square(squareName);
        System.out.println("Enter an integer for the squares length :");
        String length = br.readLine();
        System.out.println("Enter an integer for the squares height :");
        String height = br.readLine();
        s.setDimensions(Integer.parseInt(length), Integer.parseInt(height));
        s.printDimensions();

        System.out.println("\nName a circle");
        String circleName = br.readLine();
        System.out.println("Enter an integer for the circle's radius  :");
        String rad = br.readLine();
        Circle c = new Circle(circleName);
        c.setDimensions(Integer.parseInt(rad));
        c.printDimensions();


        System.out.println("\nName a triangle");
        String triangleName = br.readLine();
        System.out.println("Enter an integer for the triangle's sideA  :");
        String A = br.readLine();
        System.out.println("Enter an integer for the triangle's sideB  :");
        String B = br.readLine();
        System.out.println("Enter an integer for the triangle's sideC  :");
        String C = br.readLine();
        Triangle t = new Triangle(triangleName);
        t.setDimensions(Double.parseDouble(A), Double.parseDouble(B), Double.parseDouble(C));
        t.printDimensions();

        System.out.println("\nName a Equailateral triangle");
        String EqTriangleName = br.readLine();
        System.out.println("Enter an integer for the triangle's sides  :");
        String side = br.readLine();
        EquilateralTriangle et = new EquilateralTriangle(EqTriangleName);
        et.setDimensions(Double.parseDouble(side));
        et.printDimensions();






//        Shape t = new Triangle();

    }

}
