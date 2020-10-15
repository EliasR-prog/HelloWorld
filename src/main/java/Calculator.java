import java.lang.Math;

public class Calculator {
    private double running_total;
    public Calculator() {
        running_total = 0;
    }
    public void add(double value){
        running_total = running_total + value;
        System.out.println(running_total);
    }
    public void subtract(double value){
        running_total = running_total - value;
        System.out.println(running_total);
    }
    public void multiply(double value){
        running_total = running_total * value;
        System.out.println(running_total);
    }
    public void divide(double value){
        running_total = running_total / value;
        System.out.println(running_total);
    }
    public void square_root(){
        running_total = Math.sqrt(running_total);
        System.out.println(running_total);
    }
}
