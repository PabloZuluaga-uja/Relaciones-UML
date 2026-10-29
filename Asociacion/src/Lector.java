public class Lector {
    private String nombre;
    private String cedula;
    private Libro libroActual;

    public Lector(){
    }

    public Lector(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCedula(){
        return this.cedula;
    }

    public Libro getLibroActual(){
        return libroActual;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setLibroActual(Libro libroActual){
        this.libroActual = libroActual;
    }

    public void tomarPrestado(Libro libro){
        if (libroActual !=null) {
            System.out.println(nombre + " ya tiene el libro" + libroActual.getTitulo() + " prestado y primero debe devolverlo");
        }else{
            if (libro.prestarLibro()) {
                libroActual = libro;
            }
        }
    }

    public void regresarLibro(){
        if (libroActual == null) {
            System.err.println(nombre + " no tiene ningun libro prestado");
        }else{
            libroActual.devolverLibro();
            libroActual = null;
        }
    }
    
    public void mostrarEstado(){
        String estado = (libroActual != null) ? libroActual.getTitulo(): "Sin libro";
        System.out.println("Lector: " + nombre + " | Libro: " + estado);
    }
    
}
