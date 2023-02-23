
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.Random;
import java.util.ArrayList;

public class Task_03 {

    public static void main(String[] args) {

        ArrayList<Integer> intListRnd = new ArrayList<>();
        random_list(intListRnd, 11, 1, 99);

        int max = maxArrayNum(intListRnd);
        System.out.printf("Максимальное число списка: %s\n", max);

        int min = minArrayNum(intListRnd);
        System.out.printf("Минимальное число списка: %s\n", min);

        double arithmeticMeanList =arithmeticMeanList(intListRnd);
        System.out.printf("Среднее арефмитическое списка: %.2f", arithmeticMeanList); //%.2f округление в строке.        
    }

    //////////////////////////////////ФУНКЦИИ/////////////////////////////

    // функция созает список случаных чисел в заднном диапазоне и выводин на печать.
    public static void random_list(ArrayList<Integer> list, int sise, int start, int and) {
        var rndel = new Random();
        for (int i = 0; i < sise; i++) {
            list.add(rndel.nextInt(start, and));
        }
        System.out.println(list);
    }
    
    // функция ищет максимальное число в списке
    public static Integer maxArrayNum(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer i : list) {
            if (i > max)
                max = i;            
        }
        return max;
    }

    // функция ищет минимальное число в списке.
    public static Integer minArrayNum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min)
                min = i;
        }
        return min;
    }
    
    //функция ищет среднееарифмитическое число в списке.    
    public static Double arithmeticMeanList(ArrayList<Integer> list) {
        double sum = 0;
        double arith = 0;
        for (Integer i : list)
            sum += i;                  
        arith = (sum / list.size());
        return (arith);        
    }   
}
