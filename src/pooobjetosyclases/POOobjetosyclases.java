
package pooobjetosyclases;

public class POOobjetosyclases {

   
    public static void main(String[] args) {
     
        Libro libro1= new Libro("Harry Potter", "JK Rowling");
        Libro libro2= new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro3= new Libro("El Señor de los Anillos"," J. R. R. Tolkien");
        Libro libro4= new Libro("Orgullo y Prejuicio","Jane Austen");
         
        Usuario usuario1= new Usuario("Marjorie Cabrera");
        Usuario usuario2= new Usuario("Osmar Guerra");
        Usuario usuario3= new Usuario("Jefferson Chavez");
       
        usuario1.prestarLibro(libro4);
        usuario2.prestarLibro(libro4);
        usuario2.prestarLibro(libro2);
        usuario3.prestarLibro(libro1);
        usuario1.prestarLibro(libro3);
        
        usuario1.listarLibrosPrestados();
        usuario2.listarLibrosPrestados();
        usuario3.listarLibrosPrestados();
        
        usuario1.devolverLibro(libro4);
        usuario1.listarLibrosPrestados();
        
        
    }
    
}
