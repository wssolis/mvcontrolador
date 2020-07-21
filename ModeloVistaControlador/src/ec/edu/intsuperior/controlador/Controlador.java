/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Operaciones;
import ec.edu.intsuperior.vista.Aplicacion;
import ec.edu.intsuperior.vista.Aplicacion2;

/**
 *
 * @author Santiago
 */
public class Controlador {
    Aplicacion ap= new Aplicacion(this);
    Aplicacion2 aplicacion2= new Aplicacion2(this);
    Operaciones op= new Operaciones();
    
    public int sum(){
        return op.suma(Integer.parseInt(ap.txtNum1.getText()),
                Integer.parseInt(ap.txtNum2.getText()));
        
    }
    
    public void visible(){
        ap.setVisible(true);
    }
    
    public static void main(String[] args) {
        Controlador c= new Controlador();
       c.visible();
        c.sum();
    }
}