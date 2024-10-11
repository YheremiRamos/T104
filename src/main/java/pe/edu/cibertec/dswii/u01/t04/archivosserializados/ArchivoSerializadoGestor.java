/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivosserializados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author SUITE
 */
public class ArchivoSerializadoGestor {

    /**
     * Método que permite serializar un objeto que implemente la interfaz
     * Serializable en un archivo
     *
     * @param rutaCarpeta Ruta donde se guardará el archivo
     * @param nombreArchivo Nombre del archivo que se creará en el S. O.
     * @param objeto Objeto con su estado que persistirán en un archivo
     */
    public void serializarArchivo(String rutaCarpeta, String nombreArchivo,
            Serializable objeto) {
        File archivoSerializar = new File(rutaCarpeta, nombreArchivo);
        //Se utilizar un try-catch-with-resources para gestión eficiente flujo
        try (FileOutputStream flujoEscritura = new FileOutputStream(archivoSerializar); 
             ObjectOutputStream serializador = new ObjectOutputStream(flujoEscritura)) {
                serializador.writeObject(objeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
       Método que permite deserializar un archivo y convertirlo en un objeto
       @param rutaCompleta Ruta completa donde se encuentra el archivo a deserializar
       @return el objeto luego de realizar la lectura
    */
    public Object deserializarArchivo(String rutaCompleta){
        Object objetoLeido = null;
        File archivoDeserializar = new File(rutaCompleta);
        try (FileInputStream flujoLectura = new FileInputStream(archivoDeserializar);
             ObjectInputStream deserializador = new ObjectInputStream(flujoLectura)){
            objetoLeido = deserializador.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objetoLeido;
    }
    
    

}
