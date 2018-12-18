/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Cotizacion {
    

    private String cotizacion;

    public Cotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }
    public Cotizacion(){
    
    }
    
     public String getCotizacion(){
            return cotizacion;
        }
     
     public void setCotizacion(String cotizacion) {
		this.cotizacion = cotizacion;
	}


}
