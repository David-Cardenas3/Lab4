/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class DatosImpresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file= "..\\ListadoCarrosArchivo\\src\\ListadoCarros.csv";
        File f= new File(file);
        Impresora leerDatos= new Impresora();
        try{
            List<Impresora> CaracteristicasDocumentos=leerDatos.leerListadoDeArchivo(f);
            
                
        }catch (FileNotFoundException ex) {
            Logger.getLogger("El dato no fue procesado").log(Level.SEVERE, null, ex);
        } 
    }
    
}
