package openclosedprinciples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp Corporations
 */
public class Potencia implements Operation {
    private double base;
    private double exponente;
   
    @Override
    public double calculateOperation() {
        if (base!=0 && exponente !=0)
            return Math.pow(base, exponente);
        return -1;
    }

    public Potencia(double base, double exponente, double resultadoPotencia) {
        this.base = base;
        this.exponente = exponente;
        
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }

    
    
}
