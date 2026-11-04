package forEj;

import java.util.Random;

public class ForEj5 {
    public static void main(String[] args) {
        Random r = new Random();

        int numero = r.nextInt(5,11);;
        int resultado = 1;
        for(int i = numero; i > 0; i--){
            resultado = resultado * i;
        }
        System.out.println("El factorial del número aleatorio es: " + resultado );
        /*
        for(int i = 1; i <= numero ; i++){
            resultado = resultado * i;
        }
         */
    }
}
