package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int[] list = new int[20];
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i< list.length; i++)
       {
           String S = reader.readLine();//напишите тут ваш код
           list[i] = Integer.parseInt(S);
       }

       int[]  mas = new int[10];
       int[]  mak = new int[10];

        System.arraycopy(list, 0, mas, 0, 10);
        System.arraycopy(list, 10, mak, 0, 10);




       for (int a = 0; a < mak.length; a++)
       {
           System.out.println(mak[a]);
       }
    }
}
