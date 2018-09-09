/**
 * Created by seanmcintyre on 9/5/18.
 */
public class EquilateralTriangle extends Triangle {

    private double sideLength;

    public EquilateralTriangle(String name){
        super(name);
    }

    public void setDimensions(double sideLength){
       this.sideLength = sideLength;
    }

    @Override
    public void printDimensions(){
        System.out.printf("The Equilateral Triangle named %s \n", super.getName());
        System.out.printf("Sidelength is: : %f \n", sideLength);
        System.out.printf("Area: %f\n", getArea());
    };

    @Override
    public double getArea(){


        double s = ( (sideLength+sideLength+sideLength) / 2);
        double area = Math.sqrt(s*(s-sideLength)*(s-sideLength)*(s-sideLength));
        return area;
    };

}
