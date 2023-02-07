public class Yate extends TipoBote {

    private int numeroCamarotes;
    private double precioYate;

    public Yate (double precioBase, double valorAdicional, int anoFabricacion, int eslora,
                 double numeroCamarote, double precioVenta){

        super(precioBase, valorAdicional, anoFabricacion, eslora);
        this.numeroCamarotes=numeroCamarotes;
        this.precioYate=precioYate;
        //tipoYate();
}

       /*  public String tipoYate(){
           if (numeroCamarotes>7){
             return ("Yate de lujo");}
           else {
                 return ("Yate economico");}}*/

    @Override
    public String tipoEmbarcacion (){
        if (numeroCamarotes>7){
            return ("Yate de lujo");}
        else {
            return ("Yate economico");
    }}

    public void comprarYate (double precioOfrecido){
        if (precioOfrecido>=precioYate){
            System.out.println("Compra exitosa");
        } else {
            System.out.println("compra denegada, ahorre pobre");
        }
    }







    }

