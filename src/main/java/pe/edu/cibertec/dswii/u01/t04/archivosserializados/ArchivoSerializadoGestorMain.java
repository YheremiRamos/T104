/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivosserializados;

import java.util.Date;

/**
 *
 * @author SUITE
 */
public class ArchivoSerializadoGestorMain {
    
    
    public static void main(String[] args) {
        
        //Serializar el archivo
        ArchivoSerializadoGestor archivoSerializadoGestor = new ArchivoSerializadoGestor();
        
        String rutaCarpeta = "D:\\DSWII";
        String nombreArchivo = "clientes.dat";
        Cliente cliente = new Cliente(
                1001, 
                "Juan", 
                "Pérez", 
                "Ramón", 
                new Date(), 
                'M',
                25);
        
        archivoSerializadoGestor.serializarArchivo(rutaCarpeta, nombreArchivo, cliente);
        System.out.println("El archivo de datos se escribió correctamente en... "
                + rutaCarpeta + " -> " + nombreArchivo);
        
         //Deserializar el archivo
         String rutaCompleta = "D:\\DSWII\\clientes.dat";
         Object objeto = archivoSerializadoGestor.deserializarArchivo(rutaCompleta);
         Cliente clienteOriginal = (Cliente) objeto;
         
        System.out.println("------ Objeto Leído ------ ");
        System.out.println(objeto);
        System.out.println("Cliente: ---- (Después del casteo, podemos acceder a sus atributos) ");
        System.out.println("Código: " + clienteOriginal.getCodigo());
        System.out.println("Nombres: " + clienteOriginal.getNombres());
        System.out.println("Fecha Nac: " + clienteOriginal.getFechaNacimiento());
        System.out.println("Sexo: " + clienteOriginal.getSexo());
        System.out.println("Edad: " + clienteOriginal.getEdad());
        System.out.println("------ Fin del Objeto Leído ------ ");

         
         
    }
    
    
}
