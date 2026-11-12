package forEj;

import java.util.Random;
import java.util.Scanner;

public class ForEj2Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        //declaramos la variable m
        int[][] m;
        int acumuladora = 0;


        System.out.println("Introduce el número de filas de la matriz");
        filas = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz");
        columnas = sc.nextInt();
        //creamos la matriz (lo que está a la derecha del = ) y le damos valor a sus filas y columnas
        m = new int[filas][columnas];

        for(int i = 0; i < m.length ; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = acumuladora;
                acumuladora += 2;
            }
        }
    }
}
