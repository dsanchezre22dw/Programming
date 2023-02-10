package Sort_methods;

public class Sort {

    public static double[] bubble(double[] array){
        int i, j;
        double aux;

        for (i = 0; i < (array.length -1); i++){
            for ( j = 0; j < (array.length - i - 1); j++){
                if (array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }

            }
        }
        return array;
    }

    public static double[] quicksort(double[] array, int izq, int der){
        double pivote = array[array.length/2], aux;
        int i = izq, j = der;

        while (i < j){
            while (array[i] < pivote && i < j){
                i++;
            }
            while (array[j] > pivote){
                j--;
            }
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;

        }

        return null;




    }


    public static void show_array(double[] array){
        if (array !=null){
            for (int i = 0; i < array.length; i++){

                System.out.print(array[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("The array is null");
        }
    }

    public static void show_matrix(double[][] matrix){
        if (matrix !=null){
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("The matrix is nulL");
        }
    }


    public static void main(String[] args){

        double[] array = {3, 2, 7, 5, 9, 0};

        show_array(bubble(array));


    }


}
