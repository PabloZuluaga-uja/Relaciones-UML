public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.catalogo = new Libro[10];
        this.cantidad = 0;
    }

    public void agregarLibro(Libro libro){
        if (cantidad < catalogo.length){
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("");
        }
    }
}
