package com.javarush.test.level18.lesson10.home05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 25.08.2016.
 */
public class SolutionTest
{
    @Test
    public void roundTest() throws Exception
    {
        assertEquals("must be 0", "0", Solution.round(0));
        assertEquals("must be 3", "3", Solution.round(3.49));
        assertEquals("must be 4", "4", Solution.round(3.5));
        assertEquals("must be 4", "4", Solution.round(3.51));
        assertEquals("must be -3", "-3", Solution.round(-3.49));
        assertEquals("must be -3", "-3", Solution.round(-3.5));
        assertEquals("must be -4", "-4", Solution.round(-3.51));


    }

}