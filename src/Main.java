public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("sbastian","rodriguez", "abcd12");
        Capitan capitan1 = new Capitan("luis","remolina", "qwe147");
        TipoBote velero = new Velero(50000.0, 20000.0, 2023, 300, 5);
        TipoBote yate = new Yate(80000.0, 20000.0, 2021, 200, 8, 5000000.0);
        Embarcacion embarcacion = new Embarcacion(capitan1, yate);
        System.out.println(embarcacion.toString());
        System.out.println(yate.comprar(50000000.0));
}}

