package forEj;

import java.util.Scanner;

public class ForEj10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = teclado.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
