import java.util.Arrays;
class CountingSort {
    static void countingSort(int[] array, int n)
    {
        int i, j, size_table; 
        int max = ~0, min = -(~0); 
        for(i = 0; i < n; ++i) { // buscamos el maximo y el minimo en el arreglo
            if(max < array[i]) max = array[i];
            if(min > array[i]) min = array[i];
        } 
        size_table = max - min + 1;
        int[] table = new int[size_table];
        for(i = 0; i < n; ++i) //generar la tabla
            ++table[array[i] - min]; 
        for(i = 0, j = 0; i < size_table; ++i){ //ordenar en base a la tabla
            if((table[i]--) > 0) array[j] = (i + min);
            else ++j;
        }
        
    }
    public static void main(String[] args)
    {
        int[] arr = {4, 1, 2, 9, 7, -1};
        for(int i = 0; i < 6; ++i)
            System.out.print(arr[i] + " ");
        countingSort(arr, 6);
        System.out.println();
        for(int i = 0; i < 6; ++i)
            System.out.print(arr[i] + " ");
    }
}