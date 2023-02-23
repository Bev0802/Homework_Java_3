//Реализовать алгоритм сортировки слиянием.

import java.util.Random;
import java.util.ArrayList;

public class Task_01 {

    public static void main(String[] args) {
        ArrayList<Integer> intListRnd = new ArrayList<>();
        random_list(intListRnd, 6, 1, 99);        

        sortMerge(intListRnd);
        System.out.println(intListRnd);        
    }

    ///////////////////////////////////////// ФУНКЦИИ ////////////////////////////////////

    // функция созает список случаных чисел в заднном диапазоне и выводин на печать.
    public static void random_list(ArrayList<Integer> list, int sise, int start, int and) {
        var rndel = new Random();
        for (int i = 0; i < sise; i++) {
            list.add(rndel.nextInt(start, and));
        }
        System.out.println(list);
    }
    // функция сортировки
    public static void sortMerge (ArrayList<Integer> list){
        if (list.size() < 2) {
            return;
        }
        int sizeLR = list.size()/2;                    
        ArrayList<Integer> leftList = new ArrayList<>(list.subList (0, sizeLR));
        ArrayList<Integer> rightList = new ArrayList<>(list.subList(sizeLR, list.size()));
              
        //sortMerge(leftList);
        //sortMerge(rightList);
                
        merge(list, leftList, rightList);
    }                
    //функция слияния
    public static void merge(ArrayList<Integer> list, 
    ArrayList<Integer> leftList, ArrayList<Integer> rightList) { 
        int l = 0, r = 0;
        for (int i = 0; i < list.size(); i++) {
            while (l < leftList.size() && r < rightList.size()) {
                if (leftList.get(l) < rightList.get(r)) {
                    list.add(i, leftList.get(l));
                    leftList.remove(l);
                    l++;                                       
                }
                else {
                    list.add(i, rightList.get(r));
                    leftList.remove(r);   
                    r++;                   
                }
            }        
            
        }
    }   
        
}