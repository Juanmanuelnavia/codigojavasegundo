import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroFinal = 0;
        int sumafinal = 0;
        int iterador = 0;

        Scanner lector = new Scanner(System.in);
        System.out.print("porfavor Ingrese el número que desea calcular: ");
        numeroFinal = lector.nextInt();

        while (numeroFinal >= iterador) {
            sumafinal += iterador;
            iterador++;
        }

        System.out.println("La suma de los primeros " + numeroFinal + " los números naturales es igual a " + sumafinal);
    }
}
