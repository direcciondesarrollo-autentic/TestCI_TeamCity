import java.util.Scanner;

/**
 * Created by root on 1/8/17.
 */
public class Calculator {

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public int res(int num1, int num2){
        return num1 - num2;
    }

    public static void main(String[] args) {

        int[] numeros;

        numeros = new int[2];

        int operacion;
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int desicion;

        Scanner buffer = new Scanner(System.in);
        do {
            do {
                System.out.print("Ingrese un opcionn");
                System.out.print("opcion 1:Suman");
                System.out.print("opcion 2:Restan");
                System.out.print("opcion 3:Multiplicacionn");
                ;
                System.out.print("opcion 4ivisionn");
                operacion = buffer.nextInt();
                if (operacion > 4 || operacion < 1) {
                    System.out.println("Ingrese una opcion valida");
                }
            } while (operacion > 4 || operacion < 1);
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingrese numero:" + (1 + i));
                if (i == 0) {
                    numero1 = buffer.nextInt();
                    numeros[0] = numero1;
                }
                if (i == 1) {
                    numero2 = buffer.nextInt();
                    numeros[1] = numero2;
                }
            }
            if (operacion == 1) {
                suma = numeros[0] + numeros[1];
                System.out.println("la suma es de:" + suma);
            }
            if (operacion == 2) {
                resta = numeros[0] - numeros[1];
                System.out.println("la resta es de:" + resta);
            }
            if (operacion == 3) {
                multiplicacion = numeros[0] * numeros[1];
                System.out.println("la multipliacion es de:" + multiplicacion);
            }
            if (operacion == 4) {
                division = numeros[0] / numeros[1];
                System.out.println("la division es de:" + division);
            }
            System.out.println("ingrese '1' si quiere realizar otra operacion '2' si quiere cerrar el programa");
            desicion = buffer.nextInt();
        } while (desicion == 1 && desicion != 2);
    }

}
