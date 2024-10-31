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
public class Facturas {
    private String codigoFactura;
    private int mes;
    private int ifElectrico;
    private int ifAuto;
    private int ifConstru;
    private double montoFactura;
    private Meses enumMes;
    private int numFacturas; 
    private double bono = 0.0;
    private int puntos;
    private double comiciones;
    private double montoTotal;
    
    /*
    This is the constructor 
    */
    Vendedor vendor01 = new Vendedor();
    
    public void printer(){
            /*
            This prints in format requested
            */
        System.out.println("El Agente Vendedor "+ vendor01.getNombreCliente()+ "codigo: "+ vendor01.getIdCliente()+ "en el mes de "+ this.enumMes +" \n"+
        "Vendio un total de "+ this.montoTotal+ "en facturas"+ "\n" +
        "Obtuvo un total en comisiones de "+ this.comiciones + "\n" +
        "Puntos obtenidos por vendedor "+ this.puntos + "\n" +
        "El agente Vendedor " + vendor01.getVehiculoPropio()+" con vehiculo propio"+ "\n"+
        "Sucursal:"+ vendor01.getLugar());
    }
    
    public void calNumFacturas(){
            /*
            This classifies total mounts in bills
            */
        if (this.numFacturas < 3 || this.montoTotal < 300000) {
            this.comiciones = 20000;               
            }
    }
    
    
    public double calMontosFacturas(){
            /*
            This manage total amounts
            */
        if (this.montoFactura < 5000.0) {
            this.montoFactura = this.montoFactura + (this.montoFactura * 0.5);
            this.puntos = this.puntos + 1;
        } 
        return 0.0;
    }
    
    public void clasFacturas(){
            /*
            This manage bonos
            */
        if (this.ifElectrico <=3) {
            this.bono = 0.4;
            this.puntos = this.puntos + 1;
            
        } else {
            this.bono = 0.2;
        }
        if (this.ifAuto < 4) {
            this.bono = 0.4;
            this.puntos = this.puntos + 1;
            
        } else {
            this.bono = 0.2;
        }
        if (this.ifConstru < 0) {
            this.bono = 0.8;
            this.puntos = this.puntos + 2;
        }
            
    }
 
    
    public void runner(){
            /*
            Systematic movement across application
            */
        this.numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas va ingresar"));
        for (int i = 0; i < this.numFacturas; i++) {
            vendor01.setIdCliente();
            vendor01.setNombreCliente();
            vendor01.setVehiculoPropio();
            vendor01.setLugar();
            this.ifElectrico = Integer.parseInt(JOptionPane.showInputDialog("Cuantas productos tiene electricos?"));
            this.ifAuto = Integer.parseInt(JOptionPane.showInputDialog("Cuantas productos tiene automotrices?"));
            this.ifConstru = Integer.parseInt(JOptionPane.showInputDialog("Cuantas productos tiene construccion?"));
            this.montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Cuanto es el monto de la factura?"));
            this.mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes del valor de 1-12?"));
            clasFacturas();
            calMontosFacturas();
            calNumFacturas();
            this.montoTotal = this.montoFactura + this.montoTotal + this.comiciones;
            printer();
        }
    }
        /*
        Set & Getters for variables
        */
    
    public Facturas() {
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    
    public double getComiciones() {
        return comiciones;
    }

    public void setComiciones(double comiciones) {
        this.comiciones = comiciones;
    }

    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    public Meses getEnumMes() {
        return enumMes;
    }

    public void setEnumMes(Meses enumMes) {
        this.enumMes = enumMes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
    public int getNumFacturas() {
        return numFacturas;
    }

    public void setNumFacturas(int numFacturas) {
        this.numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas va ingresar"));
    }
 
    
    public Facturas(String codigoFactura, int mes, int ifElectrico, int ifAuto, int ifConstru, double montoFactura, int numFacturas, double bono, int puntos, double comiciones, double montoTotal) {
        this.codigoFactura = codigoFactura;
        this.mes = mes;
        this.ifElectrico = ifElectrico;
        this.ifAuto = ifAuto;
        this.ifConstru = ifConstru;
        this.montoFactura = montoFactura;
        this.numFacturas = numFacturas;
        this.bono = bono;
        this.puntos = puntos;
    }

    
    
    public String getCodigoFactura() {        
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes() {
        this.mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre"));
                
        switch (this.mes) {
            case 1:
                enumMes = Meses.Enero;
                break;
                
            case 2:
                enumMes = Meses.Febrero;
                break;
            
            case 3:
                enumMes = Meses.Marzo;
                break;
            
            case 4:
                enumMes = Meses.Abril;
                break;    
            
            case 5:
                enumMes = Meses.Mayo;
                break;
            
            case 6:
                enumMes = Meses.Junio;
                break;    
            
            case 7:
                enumMes = Meses.Julio;
                break;
                
            case 8:
                enumMes = Meses.Agosto;
                break;
                
            case 9:
                enumMes = Meses.Septiembre;
                break;
            
            case 10:
                enumMes = Meses.Octubre;
                break;
            
            case 11:
                enumMes = Meses.Noviembre;
                break;
            
            case 12:
                enumMes = Meses.Diciembre;
                break;
    
                
            default:
                throw new AssertionError("MES INVALIDO!");
        }
        
        
    }

    public int getIfElectrico() {
        return ifElectrico;
    }

    public void setIfElectrico(int ifElectrico) {
        this.ifElectrico = ifElectrico;
    }

    public int getIfAuto() {
        return ifAuto;
    }

    public void setIfAuto(int ifAuto) {
        this.ifAuto = ifAuto;
    }

    public int getIfConstru() {
        return ifConstru;
    }

    public void setIfConstru(int ifConstru) {
        this.ifConstru = ifConstru;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }
    
    
    
}
