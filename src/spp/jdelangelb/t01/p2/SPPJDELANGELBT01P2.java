
//JORGE DANIEL DEL ANGEL BOMBARDIER
//A01410409
//IMT

package spp.jdelangelb.t01.p2;
import java.util.Scanner;

public class SPPJDELANGELBT01P2 {

    
    public static void main(String[] args) {
        
        //Programa para calcular areas y perimetros de diferentes rectángulos
        
        System.out.println("Bienvenido al programa para calcular areas y perimetros de rectangulos");
        
    //DECLARACION DE VARIABLES y PEDRIR EL SCANNER
        
        double base, altu, perimetro, area;
    
//Indicar que nececitamos llamar al teclado pa que jale
        Scanner kb = new Scanner (System.in);
        
        
     //QUE COMIENCE LA PEDIDERA
        
        System.out.println("Ingresa la base ");
        base = kb.nextDouble();
        
        System.out.println("Ingresa la altura");
        altu= kb.nextDouble();
        
        area=(altu)*(base);
        perimetro=((base)*2)+((altu)*2);
        
        System.out.println("AREA"+ area);
        System.out.println("Perimetro"+ perimetro);
                
        //.
    }
    
}
