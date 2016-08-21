package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by User on 10.08.2016.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner("Иванов Иван Иванович 31 12 1950");
        Person person = new Solution.PersonScannerAdapter(scanner).read();

        System.out.println(person.toString());
    }
}
