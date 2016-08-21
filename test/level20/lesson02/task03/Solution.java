package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        OutputStream outputStream = new FileOutputStream(fileName);
        InputStream inputStream = new FileInputStream(fileName);

        Properties properties = new Properties();


        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }
}
