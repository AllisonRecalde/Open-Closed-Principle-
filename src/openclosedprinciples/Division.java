/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclosedprinciples;

/**
 *
 * @author Hp Corporations
 */
public class Division implements Operation{
    private double dividendo;
    private double divisor;
   

    @Override
    public double calculateOperation() {
        if(divisor!=0){
           return dividendo/divisor; 
        }
        return -1;    
    }
    
    public Division(double dividendo, double divisor, double cociente) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    
    
}
