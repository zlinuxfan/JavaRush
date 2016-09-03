package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine();
        String fileNameOut = reader.readLine();
        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(fileNameIn));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileNameOut));
        String line;

        while ((line = readFile.readLine()) != null)
        {
            String[] nums = line.split(" ");
            for (String num :
                    nums)
            {
                writeFile.write(round(Double.parseDouble(num)));
                writeFile.write(" ");
            }
        }

        readFile.close();
        writeFile.close();
    }

    public static String round(double num)
    {
        if (num > 0)
        {
            return new BigDecimal(num).setScale(0, RoundingMode.HALF_UP).toString();
        } else {
            return new BigDecimal(num).setScale(0, RoundingMode.HALF_DOWN).toString();
        }

    }


}
