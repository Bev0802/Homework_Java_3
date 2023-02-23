//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.Random;
import java.util.ArrayList;

public class Task_02 {

    public static void main(String[] args) {
        ArrayList<Integer> intListRnd = new ArrayList<>();
        random_list(intListRnd, 11, 1, 99);
        
        modifiedList(intListRnd);
        System.out.println(intListRnd);
    }

    //////////////////////////////////////// ФУНКЦИИ ///////////////////////////////

    // функция созает список случаных чисел в заднном диапазоне и выводин на печать.
    public static void random_list(ArrayList<Integer> list, int sise, int start, int and) {
        var rndel = new Random();
        for (int i = 0; i < sise; i++) {
            list.add(rndel.nextInt(start, and));
        }
        System.out.println(list);
    }

    // Фунция удаляет из списка четные числа.
    public static ArrayList<Integer> modifiedList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
