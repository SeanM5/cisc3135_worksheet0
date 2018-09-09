/**
 * Created by seanmcintyre on 9/5/18.
 */
public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name) {
        super(name);
    }

    public void setDimensions(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;

    }

    @Override
    public void printDimensions(){
        System.out.printf("The triangle named %s \n", super.getName());
        System.out.printf("sideA: %f \n", sideA);
        System.out.printf("sideB: %f \n", sideB);
        System.out.printf("sideC: %f \n", sideC);
        System.out.printf("Area: %f\n", getArea());

    };

    @Override
    public double getArea(){
        double s = ((sideA+sideB+sideC)/ 2);
        double area = Math.sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)));
        return area;
    };
}

