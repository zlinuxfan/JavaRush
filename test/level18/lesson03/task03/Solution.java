package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int[] data = new int[128];
        int maxByte = 0;
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            int tmp = inputStream.read();
            data[tmp]++;
        }
        inputStream.close();
        for (int i = 0; i < data.length; i ++) {
            if (maxByte < data[i]) {
                maxByte = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (maxByte == data[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
