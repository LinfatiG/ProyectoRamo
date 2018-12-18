/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import Datos.Cliente;
import Datos.Cotizacion;
import java.io.*;
import java.util.Date;


public class GestionArchivo {

    String guardarLinea;
    Date fecha = new Date();

    public String getGuardarLinea() {
        return guardarLinea;
    }

    public void setGuardarLinea(String guardarLinea) {
        this.guardarLinea = guardarLinea;
    }

    public void guardaArchivosCliente(Cliente cliente) {
        try {
            File f = new File("Datos_Cliente.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(cliente.getRut() + ";" + cliente.getNombre() + ";" + cliente.getContacto() + ";" + fecha );//escribir en el archivo

            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(cliente.getRut() + ";" + cliente.getNombre() + ";" + cliente.getContacto() + ";" + fecha);

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }


    public void buscarInformacion(String request, String guardarLinea) {

        try {
            final BufferedReader reader = new BufferedReader(new FileReader("Datos_Cliente.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(request) != -1) {
                    guardarLinea = line;
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(guardarLinea);
        this.guardarLinea = guardarLinea;
    }
    
        public void buscarInformacionCotizacion(String request, String guardarLinea) {

        try {
            final BufferedReader reader = new BufferedReader(new FileReader("Datos_Cotizaciones.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(request) != -1) {
                    guardarLinea = line;
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(guardarLinea);
        this.guardarLinea = guardarLinea;
    }
    
         public void guardaArchivoCotizacion(Cliente cliente, Cotizacion cotizacion) {
        try {
            File f = new File("Datos_Cotizaciones.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(cliente.getRut() + ";" + cliente.getNombre() + ";" + cliente.getContacto() + ";" + cotizacion.getCotizacion() + ";" + fecha);

            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(cliente.getRut() + ";" + cliente.getNombre() + ";" + cliente.getContacto() + ";" + cotizacion.getCotizacion());

            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
     
    
    
}
