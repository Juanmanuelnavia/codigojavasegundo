import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroFinal = 0;
        int sumaAcumulada = 0;
        int iterador = 0;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el número que desea calcular: ");
        numeroFinal = lector.nextInt();

        while (numeroFinal >= iterador) {
            sumaAcumulada += iterador;
            iterador++;
        }

        System.out.println("La suma de los primeros " + numeroFinal + " números naturales es igual a " + sumaAcumulada);
    }
}