package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String s = reader.readLine();
       // int b = Integer.parseInt(s);

      //  if (b % 400 == 0)
      //      System.out.println("количество дней в году: 366");
     //   else if (b % 100 == 0 && b % 400 == 0)
     //       System.out.println("количество дней в году: 366");
     //   else if (b % 100 == 0 && b % 400 != 0)
     //       System.out.print("количество дней в году 365");
    //    else if (b % 4 == 0)
     //       System.out.println("количество дней в году 366");
     //   else
      //      System.out.println("количество дней в году: 365");//напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int a = Integer.parseInt(sNumber);
        int x1 = 365;
        int x2 = 366;
        int x;
        if ((a % 4 ==0) && (a% 100!=0))
            x = x2;
        else if ((a%4==0) && (a%400==0))
            x = x2;
        else
            x = x1;
        System.out.println("количество дней в году: "+x);



    }
}