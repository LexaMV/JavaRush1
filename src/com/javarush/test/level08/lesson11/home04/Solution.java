package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int sum = array.get(0);
        for (int i = 1; i < array.size(); i++)
        {
            int g = array.get(i);
            if (sum > g)
            {
                sum = g;
            }
        }
        return sum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int t = Integer.parseInt(s);




        for (int i = 0; i < t ; i++)
        {
            String u = reader.readLine();
            int o = Integer.parseInt(u);
            list.add(o);
        }
            //Тут создать и заполнить список
        return list;
    }
}
