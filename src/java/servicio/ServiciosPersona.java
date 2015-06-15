/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servicio;

/**
 *
 * @author Martin
 */
public class ServiciosPersona {
    
    public String imprimeDatos(String mensaje,String nombre,String apellidos, Integer edad){
        String rpta="";
        rpta="<p>"+mensaje+" Correctamente</p>"
                + "<p>Nombre: "+nombre+"</p>"
                + "<p>Apellidos:  "+apellidos+"</p>"
                + "<p>Edad: "+edad+"</p>";
        return rpta;
    }
}
