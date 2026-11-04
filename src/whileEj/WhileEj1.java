package whileEj;

import java.util.Random;

public class WhileEj1 {
    public static void main(String[] args) {
        Random r = new Random();

        int i = r.nextInt(0,100);
        int denominador = i;
        int restoACero = 0;

        while(denominador > 0){
            System.out.println("Dividimos " + i + " / " + denominador);
            if(i % denominador == 0){
                restoACero++;
                System.out.println("Dividimos " + i + " / " + denominador + " y da de resto 0");
            }
            denominador--;
        }
        if(restoACero == 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

    }
}
