/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import GestionArchivos.GestionArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class GuardarDatos {

    private final ArrayList<Cliente> clientes = new ArrayList<Cliente>();// dentro de este existe el arrayList cotizacion
    private final GestionArchivo gestor = new GestionArchivo();
    private final ArrayList<Cotizacion> cotizacion = new ArrayList<Cotizacion>();
    private String mostrar;

    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void guardarCliente(String rut , String nombre , String contacto){
        Cliente e = new Cliente();
        e.setRut(rut);
        e.setNombre(nombre);
        e.setContacto(contacto);
        this.clientes.add(e);
        gestor.guardaArchivosCliente(e);
    }
    
    public String mostrarCliente(String linea, String mostrar){
           gestor.buscarInformacion(linea,mostrar);
           this.mostrar = gestor.getGuardarLinea();
           return mostrar;
           
    }
    public String mostrarCotizacion(String linea, String mostrar){
           gestor.buscarInformacionCotizacion(linea,mostrar);
           this.mostrar = gestor.getGuardarLinea();
           return mostrar;
           
    }
    public void guardarCotizacion(String rut , String nombre , String contacto, String cotizacion){
        Cotizacion cot = new Cotizacion();
        Cliente cl = new Cliente();
        cl.setRut(rut);
        cl.setNombre(nombre);
        cl.setContacto(contacto);
        cot.setCotizacion(cotizacion);
        gestor.guardaArchivoCotizacion(cl , cot);
    }
}
   
    

    

    