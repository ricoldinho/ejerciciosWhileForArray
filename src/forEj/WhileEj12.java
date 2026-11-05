package forEj;

import java.util.Scanner;

public class WhileEj12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int cuenta5y10 = 0;
        int cuenta11y15 = 0;
        int cuentaOtros = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextInt();
            if(numero >= 5 && numero <= 10){
                cuenta5y10++;
            }else if(numero >= 11 && numero <= 15){
                cuenta11y15++;
            }else if(numero >= 0){
                cuentaOtros++;
            }else{
                System.out.println("Numero fuera de rango, debe ser positivo");
            }
        }while(numero >= 0);

        System.out.println("numeros entre 5 y 10: " + cuenta5y10);
        System.out.println("numeros entre 11 y 15: " + cuenta11y15);
        System.out.println("numeros fuera de los rangos: " + cuentaOtros);
    }
}
