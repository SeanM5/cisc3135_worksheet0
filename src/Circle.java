/**
 * Created by seanmcintyre on 9/5/18.
 */
public class Circle extends Shape {

    private int rad;

    public Circle(String name) {
        super(name);
    }

    public void setDimensions(int rad){
        this.rad = rad;
    }

    @Override
    public void printDimensions(){
        System.out.printf("The circle named %s \n", super.getName());
        System.out.printf("Radius: %d \n", rad);
        System.out.printf("Area: %f\n", getArea());

    };

    @Override
    public double getArea(){
        return Math.PI*Math.pow(rad, 2);
    };
}
