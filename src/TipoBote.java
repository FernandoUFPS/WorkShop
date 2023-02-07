public abstract class TipoBote {


    private double precioBase;
    private double valorAdicional;
    private int anoFabricacion;
    private int eslora;

    public TipoBote(double precioBase, double valorAdicional, int anoFabricacion, int eslora) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public double montoAlquiler (){
        double preciototal=0;
        if (anoFabricacion>2020){
            preciototal=precioBase+valorAdicional;
        } else
            preciototal=precioBase;
        return preciototal;
    }

    public String tipoEmbarcacion (){
        return null;
    }


    public abstract String comprar(double precioOfrecido);
}

