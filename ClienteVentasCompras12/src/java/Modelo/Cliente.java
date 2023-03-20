/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Cliente {
    
    Cliente  cli;
    ArrayList arrayCliente=new ArrayList();
    Producto objP=new Producto();
    ArrayList<Producto> arrayP=new ArrayList();
    ArrayList<Producto> arrayItem=new ArrayList();
    Iterator <Producto> iterador=arrayP.iterator();
    private String nombre;
    private double telefono;
    private String correo;
    private String respuesta;

    public Cliente() {
    }
    public Cliente(String nombre, double telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public ArrayList getArrayCliente() {
        return arrayCliente;
    }

    public void setArrayCliente(ArrayList arrayCliente) {
        this.arrayCliente = arrayCliente;
    }

    public ArrayList<Producto> getArrayP() {
        return arrayP;
    }

    public void setArrayP(ArrayList<Producto> arrayP) {
        this.arrayP = arrayP;
    }

    public ArrayList<Producto> getArrayItem() {
        return arrayItem;
    }

    public void setArrayItem(ArrayList<Producto> arrayItem) {
        this.arrayItem = arrayItem;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    
    
    public void agregarCliente(String nombre, double telefono, String correo){
        cli = new Cliente(nombre,telefono,correo);
        arrayCliente.add(cli);
    }
    public void agregarProducto(String nombre, float precio, int cantidad){
        objP=new Producto(nombre, precio, cantidad);
        arrayP.add(objP);
        }
    public String comprar(String nombre, int cantidad){
        while (iterador.hasNext()){
        objP=iterador.next();
        
        if (nombre.equalsIgnoreCase(objP.getNombre()))
            {
            if (objP.getExistencia()<cantidad){
        
                }
                else{
                respuesta="Ha comprado"+cantidad;
                
                float precio=(float) objP.getPrecio();
                objP.setExistencia(objP.getExistencia()-cantidad);
                objP=new Producto(nombre, precio, cantidad);
                arrayItem.add(objP);
                }
            } 
        }    
    return respuesta;
    }
    public void vender(String nombre, int cantidad){
        while(iterador.hasNext()){
            objP=iterador.next();
            if(nombre.equals(objP.getNombre())){
                objP.setExistencia(objP.getExistencia()+cantidad);
            }        
        }
    }
    
}
