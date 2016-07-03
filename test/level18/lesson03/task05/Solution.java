package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileData = new FileInputStream(fileName);
        int[] data = new int[128];
        while (fileData.available() > 0) {
            data[fileData.read()] = 1;
        }
        fileData.close();

        for (int i = 0; i < data.length; i ++) {
            if (data[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }

}
