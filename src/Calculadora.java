import java.util.Scanner;

public class Calculadora {
    // Se declaran los atributos del constructor
    double valor1;
    double valor2;

    // Se crea el constructor Calculadora
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

   //Se crean los metodos de las operaciones
    // Método para suma
    public double sumar() {
        return valor1 + valor2;
    }
    // Método para resta
    public double restar() {
        return valor1 - valor2;
    }
    // Método para multiplicación
    public double multiplicar() {
        return valor1 * valor2;
    }
    // Método para división
    public double dividir() {
        return valor1 / valor2;
    }
    }
    public void main(String[] args) {
        // se crea el scanner
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que seleccione una operación
        System.out.println("Bienvenid@ a nuestra calculadora");
        System.out.println("Por favor seleccione la operación que desea realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        //Se gusrada el valor de la opción en el atributo opcion
        int opcion = scanner.nextInt();
        // Pedir al usuario que ingrese datos
        System.out.print("Ingrese el primer valor: ");
        //Se guarda el valor de la opción en el atributo valor1
        double valor1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        //Se guarda el valor de la opción en el atributo valor2
        double valor2 = scanner.nextDouble();

        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora(valor1, valor2);
        // Se crea el atributo resultado
        double resultado;
        // Se realiza la operación seleccionada utilizando el metodo switch case
        switch (opcion) {
            case 1:
                resultado = calculadora.sumar();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = calculadora.restar();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar();
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                 resultado = calculadora.dividir();
                 System.out.println("El resultado de la división es: " + resultado);

                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
