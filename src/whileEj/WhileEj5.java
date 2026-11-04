package whileEj;

public class WhileEj5 {
    public static void main(String[] args) {
    int[] array1 = {11, 9, 7, 5, 3, 1};
    int[] array2 = new int[array1.length];
        //para acceder a las posiciones del array
    int i = array1.length;
        //para acceder a las posiciones del array1
    int j = 0;
    while(i > 0){
        //accedemos a la ultima pos del array2 y le asignamos
        // el valor del array1 en la primera posicion
        array2[i-1] = array1[j];
        i--;
        j++;
    }

    }
}
