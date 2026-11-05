package forEj;

import java.util.Scanner;

public class ForEj11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contadorNegativos = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextInt();
           if(numero < 0){
               System.out.println("Número negativo detectado");
               contadorNegativos++;
           }else{
               System.out.println("Número positivo detectado");
           }
        }
        System.out.println("Total de números negativos: " + contadorNegativos);
        System.out.println("Total de números positivos: " + (10 - contadorNegativos));
    }
}
