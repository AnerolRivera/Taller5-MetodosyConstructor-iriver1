public class Restaurante {

    //Atributos del constructor
    String arroz;
    String sal;

    // Constructor
    public  Restaurante(String arroz, String sal){
        this.arroz= arroz;
        this.sal= sal;
    }
    //Metodo ArrozPollo
    public void arrosPollo(String tipoPollo){
        System.out.println("Este plato se hizo con: " + arroz + ", " + sal + " y el tipo de pollo es: " + tipoPollo);
    }

    //Metodo ArrozCarne
    public void arrosCarne(String tipoCarne){
        System.out.println("Este plato se hizo con: " + arroz + ", " + sal + " y el tipo de carne es: " + tipoCarne);
    }
    public static void main(String[] args) {
        //Instanciar la clase Restaurante
        Restaurante restaurante = new Restaurante("Arroz blanco", "Sal marina");
        //Instanciar metodo arrozPollo y le pasamos el tipoPollo
        restaurante.arrosPollo("Pollo Criollo");
        //Instanciar metodo arrozCarne y le pasamos el tipoCarnee
        restaurante.arrosCarne("Carne de Res");


    }
}

