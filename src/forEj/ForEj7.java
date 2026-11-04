package forEj;

import java.util.Scanner;

public class ForEj7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicioIntervalo;
        int finIntervalo;
        int sumaPares = 0;
        int sumaImpares = 0;
        do{
            System.out.println("Ingrese el número menor del intervalo: ");
            inicioIntervalo = teclado.nextInt();
            System.out.println("Ingrese el número mayor del intervalo: ");
            finIntervalo = teclado.nextInt();
            if(inicioIntervalo > finIntervalo){
                System.out.println("El intervalo no es correcto");
            }
        }while(finIntervalo < inicioIntervalo);

        for(int i = inicioIntervalo; i <= finIntervalo; i++){
            if(i % 2 == 0){
                sumaPares = sumaPares + i;
            }else{
                sumaImpares = sumaImpares + i;
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
}
