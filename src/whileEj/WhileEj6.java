package whileEj;

import java.util.Random;
import java.util.Scanner;

public class WhileEj6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese un numero para decidir el tamaño del array: ");
        int tamanhoArray = teclado.nextInt();
        int[] miArray = new int[tamanhoArray];

        while(tamanhoArray > 0){
            miArray[tamanhoArray-1] = r.nextInt(20,30);
            tamanhoArray--;
        }
        int posicion = 0;
        int mayor = 0;
        while(posicion < miArray.length){
            if(miArray[posicion] > mayor){
                mayor = miArray[posicion];
                System.out.println("El numero mayor nuevo es: " + mayor);
            }
            posicion++;
        }




    }
}
