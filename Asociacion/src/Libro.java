public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(){
        disponible = true;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public boolean isDisponible(){
        return this.disponible;
    }

    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isEmpty()) {
            titulo = this.titulo;
        }else{
            System.out.println("El titulo del libro no es valido, ya que no puede estar vacio");
        }
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void mostrarInfo(){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("La disponibilidad del libro es: " + disponible);
    }

    public boolean prestarLibro(){
        if (disponible) {
            disponible = false;
            System.out.println("El libro: " + titulo + " fue prestado");
            return true;
        }else{
            System.err.println("El libro: " + titulo + " ya fue prestado");
            return false;
        }
    }

    public void devolverLibro(){
        this.disponible = true;
    }


}
