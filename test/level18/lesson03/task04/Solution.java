package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int[] data = new int[128];
        int min = 256;
        int tmp;
        FileInputStream fileData = new FileInputStream(fileName);
        while (fileData.available() > 0) {
            data[fileData.read()] ++;
        }
        fileData.close();

        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0 && data[i] < min) {
                min = data[i];
            }
        }

        for (int i = 0; i < data.length; i ++) {
            if (data[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
