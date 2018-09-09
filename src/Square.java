/**
 * Created by seanmcintyre on 9/5/18.
 */
public class Square extends Shape {

    private int length;
    private int height;

    public Square(String name){
        super(name);
    };

    public void setDimensions(int l, int h){
        this.height = h;
        this.length = l;
    };

    @Override
    public void printDimensions(){
        System.out.printf("The square named %s \n", super.getName());
        System.out.printf("Length: %d \n", length);
        System.out.printf("Height: %d\n", height);
        System.out.printf("Area: %f\n", getArea());

    };

    @Override
    public double getArea(){
        return length*height;
    };

}
