package whileEj1;

import java.util.Scanner;

public class WhileEj2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextInt();
        }while(numero != 0);
    }
}
