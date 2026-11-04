package forEj;

import java.util.Random;

public class ForEj6 {
    public static void main(String[] args) {
        Random r = new Random();
        int aleatorio;
        int menor = 100;
        for(int i = 1; i <= 20; i++){
            aleatorio = r.nextInt(1, 101);
            if(aleatorio < menor){
                menor = aleatorio;
            }
        }
    }
}
