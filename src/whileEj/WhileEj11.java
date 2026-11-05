package whileEj;

import java.util.Scanner;

public class WhileEj11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int[] almacenNumeros = new int[2];
        int posicion = 0;

        do{
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextInt();
            if(numero != 0){
                almacenNumeros[posicion%2] = numero;
                posicion++;
            }
        }while(numero != 0);

        for(int i = 0; i < almacenNumeros.length; i++){
            suma += almacenNumeros[i];
        }
        System.out.println("La suma de los 2 últimos número es: " + suma);

    }
}
