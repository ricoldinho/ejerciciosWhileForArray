package fechas;

import java.util.Scanner;

public class Ej1b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        do{
            System.out.println("Ingrese un número: ");
            numero = teclado.nextInt();
        }while(numero < 1);
        
        System.out.println("El dia de la semana es: " + diasSemana[numero%7]);
    }
}
