/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1ejercicioobcamp;
/* Crear una función con tres parametros que sean números
que se suman entre si.
Segunda parte:
Crear una clase coche
• Dentro de la clase coche, una variable numérica que almacene el número de
puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
• Mostrar el número de puertas que tiene el objeto.
*/
public class Main {
    
    public static void main(String[] args) {
        int calculo = Suma(1,2,3);
        System.out.println("la suma es: "+ calculo);
        
        Coche miCoche = new Coche();
        miCoche.addPuertas();
        
        System.out.println("el numero de puertas del carro es "+miCoche.puertas);
        
    } 
    
    public static  int Suma(int a,int b, int c){
        return a + b + c;
    }
     
   
    }
class Coche {

    public int puertas = 0;

    public void addPuertas() {
        this.puertas++;
    }

}
