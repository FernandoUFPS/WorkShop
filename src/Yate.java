public class Yate extends TipoBote {

    private int numeroCamarotes;
    private double precioVenta;

    public Yate (double precioBase, double valorAdicional, int anoFabricacion, int eslora,
                 double numeroCamarote, double precioVenta){

        super(precioBase, valorAdicional, anoFabricacion, eslora);
        this.numeroCamarotes=numeroCamarotes;
        this.precioVenta=precioVenta;
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


    @Override
     public String comprar (double precioOfrecido){
        if (precioOfrecido>=precioVenta){
            return  ("Compra exitosa");
       } else {
           return ("compra denegada, ahorre pobre");
       }
   }







    }

