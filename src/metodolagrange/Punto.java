/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodolagrange;

/**
 *
 * @author Usuario
 */
public class Punto {
    private int i; //Posición
    private double x; //valor de la v.i
    private double y; // valor de la función v.d

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "i=" + i + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
