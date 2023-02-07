public class Embarcacion {

    private Capitan capitan;
    private TipoBote tipobote;

    public Embarcacion(Capitan capitan, TipoBote tipobote) {
        this.capitan = capitan;
        this.tipobote = tipobote;
    }

    @Override
    public String toString() {
        return "El nombre del capitan asignado es= " + capitan.getNombre() + " \n tipo de bote es: " +tipobote.tipoEmbarcacion() +
                " \n El precio por alquiler de: " +tipobote.tipoEmbarcacion()+ " \n es de: " +tipobote.montoAlquiler();

    }
}
