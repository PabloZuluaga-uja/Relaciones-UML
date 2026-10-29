public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel garcia marquez");
        Libro libro2 = new Libro("El principito", "Anotine xxax");

        Lector lector1 = new Lector("Pepito 1", "11111");
        Lector lector2 = new Lector("Pepito 2", "222222");

        System.out.println("");
        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        System.out.println();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();
        

    }
}
