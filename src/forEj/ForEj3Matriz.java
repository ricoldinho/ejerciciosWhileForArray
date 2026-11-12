package forEj;

public class ForEj3Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int impares = 49;

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = impares;
                impares -=2;
            }
        }
    }
}
