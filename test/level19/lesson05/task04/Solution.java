package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();

        BufferedReader readerFile = new BufferedReader(new FileReader(fileIn));
        BufferedWriter readerWrite = new BufferedWriter(new FileWriter(fileOut));
        int  sing = readerFile.read();

        while (sing > -1)
        {
            sing = sing == 46 ? 33 : sing;
            readerWrite.write(sing);
            sing = readerFile.read();
        }

        readerFile.close();
        readerWrite.close();
    }
}
