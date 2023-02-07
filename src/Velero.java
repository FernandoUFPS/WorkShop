public class Velero extends TipoBote {

    private int numeroMastiles;

    public Velero (double precioBase, double valorAdicional, int anoFabricacion, int eslora, int numeroMastiles){
        super(precioBase, valorAdicional, anoFabricacion, eslora);
        this.numeroMastiles=numeroMastiles;
        //tipoVelero();
    }

   /* public String tipoVelero (){
        if (numeroMastiles>4){
            return ("Velero Grande");
        } else
            return ("Velero Pequeño");*/

    @Override
    public String tipoEmbarcacion (){
        if (numeroMastiles>4){
            return ("Velero Grande");
        } else
            return ("Velero Pequeño");
        }

    @Override
    public String comprar(double precioOfrecido) {
        return null;
    }

}






