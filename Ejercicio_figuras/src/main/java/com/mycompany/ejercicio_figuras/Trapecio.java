
package com.mycompany.ejercicio_figuras;


    public class Trapecio {
    int base1, base2, altura;
    
    
    Trapecio(int base1, int base2, int altura) {
    this.base1 = base1;
    this.base2 = base2;
    this.altura = altura;
    }
    
    double calcularArea() {
    return ((base1 + base2) / 2) * altura;
    }
   
    double calcularLado() {
    if (base1 < base2)     
        return Math.pow(((base2 - base1)/2)*((base2 - base1)/2) + altura*altura, 0.5);
    else 
        return Math.pow(((base1 - base2)/2)*((base1 - base2)/2) + altura*altura, 0.5);    
    }
    double calcularPerimetro() {
    return base1 + base2 + (calcularLado()*2) ;
    }
}
