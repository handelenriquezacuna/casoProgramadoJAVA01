/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramadojavahandel;

import javax.swing.JOptionPane;

/**
 *
 * @author hande
 */
public class Vendedor {
    private String nombreCliente;    
    private String idCliente;
    private String vehiculoPropio;
    private String lugar;
        /*
        Set & Getters for variables
        */
    public Vendedor() {
        
    }
    
    public Vendedor(String nombreCliente, String idCliente, String vehiculoPropio, String lugar) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.vehiculoPropio = vehiculoPropio;
        this.lugar = lugar;
        
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar() {
        this.lugar = JOptionPane.showInputDialog("De lugar es?");
    }
    
    public String getVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio() {
        this.vehiculoPropio = JOptionPane.showInputDialog("Tiene vehiculo Propio?");
    }
    
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente() {
        this.nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre");
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente() {
        this.idCliente = JOptionPane.showInputDialog("Ingrese el cedula");
        this.idCliente = "A"+ this.idCliente;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
