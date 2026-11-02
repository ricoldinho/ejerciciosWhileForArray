package whileEj1;

import java.util.Scanner;

public class WhileEj3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroNumeros = 0;
        int resultadoSuma = 0;

        while(numeroNumeros < 10){
            System.out.println("Ingrese un numero: ");
            //resultadoSuma += teclado.nextInt();
            resultadoSuma = resultadoSuma + teclado.nextInt();
            System.out.println("La suma es: " + resultadoSuma);
            numeroNumeros++;
        }
    }
}
