/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocoche;

import servicios.ServiciosCoche;

/**
 *
 * @author Lucas
 */
public class EjemploCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche miCoche = new Coche();
        miCoche.setCantidadPuertas(3);
        System.out.println("La cantidad de puertas es: " + miCoche.getCantidadPuertas());
    }
    
}
