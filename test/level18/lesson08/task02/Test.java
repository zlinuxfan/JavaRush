package com.javarush.test.level18.lesson08.task02;

import java.io.IOException;

/**
 * Created by kde on 04.07.16.
 */
public class Test {
    public static void main(String[] args) throws IOException
    {
        AmigoOutputStream amigoOutputStream =null;
        QuestionFileOutputStream questionFileOutputStream = new QuestionFileOutputStream(amigoOutputStream);
        questionFileOutputStream.close();
    }
}
