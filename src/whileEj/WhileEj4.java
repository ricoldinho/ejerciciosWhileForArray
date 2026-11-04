package whileEj;

import java.util.Scanner;

public class WhileEj4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        do{
            System.out.println("Ingrese dos numeros: ");
            System.out.println("Ingrese el primer numero: ");
            num1 = teclado.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = teclado.nextInt();
        }while(num1 != num2);
    }
}
