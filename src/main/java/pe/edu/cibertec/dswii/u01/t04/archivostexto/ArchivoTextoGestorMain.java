/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivostexto;

/**
 *
 * @author SUITE
 */
public class ArchivoTextoGestorMain {
    
    public static void main(String[] args) {
        
        ArchivoTextoGestor archivoTextoGestor = new ArchivoTextoGestor();
        
        //Escritura del Archivo de Texto
                            //Nombre, Apellido, FechaNacimiento, Saldo
        String contenido = """
                           Juan, Perez, 15-08-2000, 5000 
                           María, Juárez, 05-03-1996, 8000 
                           Geancarlo, López, 13-01-1998, 9000 
                           Luisa, Jiménez, 05-05-1995, 3000 
                           """;
        
        String rutaCarpeta = "D:\\DSWII";
        String rutaArchivo = "clientes.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpeta, 
                rutaArchivo, contenido);
        System.out.println("El archivo se escribió correctamente en... "
                + rutaCarpeta + " -> " + rutaArchivo);
        
        //Lectura del Archivo de Texto
        String rutaArchivoLectura = "D:\\DSWII\\clientes.txt";
        String contenidoLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoLectura);
        System.out.println("------ Contenido Leído ------ ");
        System.out.println(contenidoLeido);
        System.out.println("------ Fin del Contenido Leído ------ ");
        
    }
    
    
}
