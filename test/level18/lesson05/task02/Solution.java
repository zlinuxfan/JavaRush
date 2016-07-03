package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int numberOfCommas = 0;
        byte[] buffer;

        FileInputStream fileData = new FileInputStream(fileName);
        if (fileData.available() > 0) {
            buffer = new byte[fileData.available()];
            fileData.read(buffer);

            for (byte el: buffer) {
                if ((int)el == 44) {
                    numberOfCommas ++;
                }
            }
        }
        fileData.close();
        System.out.println(numberOfCommas);
    }
}
