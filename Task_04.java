/*4*.  (Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой*/

import java.util.Random;
import java.util.ArrayList;

public class Task_04 {

    public static void main(String[] args) {
        
        ArrayList<Integer> listA = new ArrayList<>();
        random_list(listA, 10, 1, 99);

        ArrayList<Integer> listB = new ArrayList<>();
        random_list(listB, 10, 1, 99);

        ArrayList<Integer> listA_B = A_B(listA, listB);
        System.out.println(listA_B);
        
        ArrayList<Integer> listB_A = B_A(listA, listB);
        System.out.println(listB_A);

        ArrayList<Integer> listA_B_B_A = A_B_B_A(listA_B, listB_A);
        System.out.println(listA_B_B_A);     
    }

    ////////////////////////////////// ФУНКЦИИ/////////////////////////////

    // функция созает список случаных чисел в заднном диапазоне и выводин на печать.

    public static void random_list(ArrayList<Integer> list, int size, int start, int and) {

        var rndel = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rndel.nextInt(start, and));
        }
        System.out.println(list);
    }        

    public static ArrayList<Integer> A_B (ArrayList<Integer> listA, ArrayList<Integer> listB) {

        ArrayList<Integer> listA_B = new ArrayList<>();
        for (Integer i : listA) {
            int count = 0;
            for (Integer j : listB) {
                if (i != j)
                    continue;
                else
                    count++;
            }
            if (count == 0)
                listA_B.add(i);
        }
        return listA_B;
    }

    public static ArrayList<Integer> B_A(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> listB_A = new ArrayList<>();

        for (Integer i : listB) {
            int count = 0;
            for (Integer j : listA) {
                if (i != j)
                    continue;
                else
                    count++;
            }
            if (count == 0)
                listB_A.add(i);
        }
        return listB_A;
    }

    public static ArrayList<Integer> A_B_B_A(ArrayList<Integer> listA, ArrayList<Integer> listB){
        ArrayList<Integer> A_B_B_A = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            A_B_B_A.add(listA.get(i));
        }
        for (int j = 0; j < listB.size(); j++) {
            A_B_B_A.add(listB.get(j));            
        }
        return A_B_B_A;
    }
}