package fechas;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese un número del 1 al 7: ");
            numero = teclado.nextInt();
        }while(numero < 1 || numero > 7);

        switch(numero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
                case 5:
                System.out.println("Viernes");
                break;
                case 6:
                System.out.println("Sabado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }

    }
}
