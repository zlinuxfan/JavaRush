package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        String line;
        int counter = 0;
        while ((line = readerFile.readLine()) != null)
        {
            String[] parts = (line).split("[., !?;:-]");
            for (String part :
                    parts)
            {
//                System.out.println(part);
                if(part.equals("world")||part.equals("World")||part.equals("WORLD"))
                {
                    counter++;
//                    System.out.println("+1");
                }
            }
        }
        readerFile.close();
        System.out.println(counter);
    }
}
