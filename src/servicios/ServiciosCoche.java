/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import ejemplocoche.Coche;

/**
 *
 * @author Lucas
 */
public class ServiciosCoche {
    
    Coche coche = new Coche();
    
    
    public void incrementarPuertas(Coche coche){
        int totalPuertas;
        totalPuertas=coche.getCantidadPuertas()+1;
    } 
    
      
}
