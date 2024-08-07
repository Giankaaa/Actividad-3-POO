
package com.mycompany.ejercicio_figuras;

    
    public class Rombo {
    int diagonal1, diagonal2;
    

    Rombo(int diagonal1, int diagonal2) {
    this.diagonal1 = diagonal1;
    this.diagonal2 = diagonal2;
    }
    
    double calcularArea() {
    return (diagonal1 * diagonal2) / 2;
    }
 
   
    double calcularPerimetro() {
        return 2 * Math.pow(diagonal1*diagonal1 + diagonal2*diagonal2, 0.5) ;
    }
    
}
