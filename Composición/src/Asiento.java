public class Asiento {

    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo){
        this.codigo = codigo;
        this.ocupado = ocupado;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public boolean getOcupado(){
        return this.ocupado;
    }

    public void ocupar(){
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya se encuentra ocupado");
        }else{
            ocupado = true;
        }
    }

    public void liberar(){
        ocupado = false;
        System.out.println("Asiento " + codigo + " liberado.");
    }

    public void mostrarEstado(){
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "ocupado" : "libre"));
    }

}