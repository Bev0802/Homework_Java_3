//Реализовать алгоритм сортировки слиянием.
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;;
public class Task_01{
    public static void main(String[] args) {
          
        ArrayList<Integer> intAListRnd = new ArrayList<>();
        random_list(intAListRnd, 10, 1, 99);
        int[] intListRnd = new int [intAListRnd.size()];
        for (int i = 0; i < intListRnd.length; i++) {
            intListRnd[i] = intAListRnd.get(i);            
        }
        System.out.println(Arrays.toString(intListRnd));
        int[] sortlist = sort(intListRnd); 

        System.out.println(Arrays.toString(sortlist));   
    }
    
        ///////////////////////////////////////// ФУНКЦИИ ////////////////////////////////////
    
        // функция созает список случаных чисел в заднном диапазоне и выводин на печать.
        public static void random_list(ArrayList<Integer> list, int sise, int start, int and) {
            var rndel = new Random();
            for (int i = 0; i < sise; i++) {
                list.add(rndel.nextInt(start, and));
            }            
        }    


        public static int[] sort(int[] array) {
            int[] list = Arrays. copyOf(array, array.length); 
            doSort(list); 
            return list; 
        } 
    
        public static void doSort(int[] list) { 
            int len = list.length; 
            if (len == 1) 
            return; 
        
            int lLeft = len/2; 
            int[] left = Arrays.copyOf(list, lLeft); 
            int[] right = Arrays.copyOfRange(list, lLeft, len); 
        
            doSort(left); 
            doSort(right); 
        
            merge(left, right, list); 
        } 
        
        public static void merge(int[] left, int[] right, int[] result) { 
            int l = 0; 
            int r = 0; 
            int i = 0; 
        
            while (l < left.length && r < right.length) { 
                if (left[l] < right[r]) { 
                    result[i] = left[l]; 
                    l++; 
                } else { 
                    result[i] = right[r]; 
                    r++; 
                } 
                i++; 
            } 
            System.arraycopy(left, l, result, i, left.length - l); 
            System.arraycopy(right, r, result, i, right.length - r); 
        } 
}  