/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author WINDOWS 10
 */
public final class Cliente {
        private String nombre;
	private String rut;
	private String contacto; 
        
        public Cliente(){
            
        }

    public Cliente(String rut, String nombre, String contacto) {
        this.nombre = nombre;
        this.rut = rut;
        this.contacto=contacto;
        
    }
        public String getNombre(){
        return this.nombre;
        }
        public String getRut(){
            return rut;
        }
        public String getContacto(){
            return contacto;
        }      
	
        public void setNombre(String nombre) {
                this.nombre = nombre;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
 
}