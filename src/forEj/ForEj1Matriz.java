package forEj;

import java.util.Random;
import java.util.Scanner;

public class ForEj1Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int filas = 0;
        int columnas = 0;
        //declaramos la variable m
        int[][] m;
        int numeroADetectar;
        boolean detectado = false;
        int contador = 0;

        System.out.println("Introduce el número de filas de la matriz");
        filas = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz");
        columnas = sc.nextInt();
        //creamos la matriz (lo que está a la derecha del = ) y le damos valor a sus filas y columnas
        m = new int[filas][columnas];

        //Rellenar o asignar valores a las celdas de una matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length ;j++){
                //por cada iteración del for exterior, aquí trabaja columnas veces
                m[i][j] = r.nextInt(0,11);
            }
        }

        do{
            System.out.println("Escoge el número que debemos detectar dentro de la matriz 0-10:");
            numeroADetectar = sc.nextInt();
        }while(numeroADetectar < 0 || numeroADetectar > 10);

        //Leer valores en las celdas de una matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length ;j++){
                //por cada iteración del for exterior, aquí trabaja columnas veces
                if(m[i][j] == numeroADetectar){
                    detectado = true;
                    contador++;
                }
            }
        }
        System.out.println("El número es detectado?" + detectado);
        System.out.println("Ha sido detectado un total de: " + contador);







    }
}
