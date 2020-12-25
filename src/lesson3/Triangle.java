package lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;




public class Triangle extends GeometricFigure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public int calculateSquare() {
        return 0;
    }

    // why do not work

}


