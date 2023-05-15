package Entidades;

/**
 *
 * @author mauro
 */
public class ParDeNumeros {
    private double num1;
    private double num2;

    public ParDeNumeros() {
        num1 = (int) ((Math.random() * 10) * 100);
        num1 /= 100;
        num2 = (int) ((Math.random() * 10) * 100);
        num2 /= 100;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
