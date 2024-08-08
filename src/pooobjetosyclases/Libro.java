
package pooobjetosyclases;


public class Libro {
    
    private String titulo;
    private String autor; 
    private Boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean estaDisponible(){
        return disponible;    
        
    }
    
    public void prestar(){
        if(disponible){
            disponible=false;            
        }else {
        System.out.println("El libro que desea adquirir no se encuestra disponible");
       
        }
    }
    
    public void devolver(){
        disponible=true;
    }
    
    
}
