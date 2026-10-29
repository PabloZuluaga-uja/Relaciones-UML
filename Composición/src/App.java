public class App {
    public static void main(String[] args) throws Exception {
        Vuelo vuelo1 = new Vuelo("AV9401", "Bogotá", "Medellin", 5);
        vuelo1.mostrarInfo();

        System.out.println();
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");
        vuelo1.embarcar("A5");
        vuelo1.embarcar("A1");

        System.out.println("");
        vuelo1.mostrarAsientos();

        System.out.println("");
        vuelo1.desembarcar("A3");
        vuelo1.mostrarAsientos();
    }
}
