
package pooobjetosyclases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void prestarLibro(Libro libro){
        if(libro.estaDisponible()){
            libro.prestar();
            
            librosPrestados.add(libro);
            System.out.println(nombre+" Ha prestado el libro: " + libro.getTitulo());
          
        }else {
            System.out.println("El libro: "+ libro.getTitulo()+" No esta disponible para ser prestado");   
        }
    }
    
    public void devolverLibro(Libro libro){
        if(librosPrestados.remove(libro)){
            libro.devolver();
            System.out.println(nombre+" Ha devuelto el libro: "+ libro.getTitulo());
            
        }else{
            System.out.println(nombre+ " No tiene prestado el libro: " + libro.getTitulo());
        }
    }
    
    public void listarLibrosPrestados(){
        if(librosPrestados.isEmpty()){
            System.out.println(nombre+ " No tiene el libro prestado");
        }else{
            System.out.println(nombre+ " Tiene los siguientes libros prestados: ");
        for(Libro libro : librosPrestados){
            System.out.println(" - "+ libro.getTitulo()+ " de " + libro.getAutor());
        }
        }
    }
    
    
}
