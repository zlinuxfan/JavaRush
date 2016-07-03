package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> nameFiles = new ArrayList<>();
        for (int i = 0; i < 3; i ++) {
            nameFiles.add(reader.readLine());
        }
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(nameFiles.get(0));
        FileOutputStream fileOut1 = new FileOutputStream(nameFiles.get(1));
        FileOutputStream fileOut2 = new FileOutputStream(nameFiles.get(2));
        if (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];

            int count = fileInputStream.read(buffer);
            if (count % 2 != 0) {
                fileOut1.write(buffer, 0, count/2+1);
                fileOut2.write(buffer, count/2 + 1, count - (count/2 + 1));
            } else {
                fileOut1.write(buffer, 0, count/2);
                fileOut2.write(buffer, count/2, count - (count/2));
            }

            fileInputStream.close();
            fileOut1.close();
            fileOut2.close();
        }
    }
}
