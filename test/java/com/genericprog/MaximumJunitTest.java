package com.genericprog;

import com.maximumtest.MaximumTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumJunitTest {
    MaximumTest maximumTest = new MaximumTest();
    @Test
    public void givenIntegerObjectShouldReturnMax()
    {
       int max = maximumTest.maximum(7,8,9);
       System.out.println(max);
        Assertions.assertEquals(9,max);
    }
    @Test
    public void givenFloatObjectShouldReturnMax()
    {
        float max = maximumTest.maximum(4.5f,4.6f,4.7f);
        System.out.println(max);
        Assertions.assertEquals(4.7f,max);
    }
    @Test
    public void givenStringObjectShouldReturnMax()
    {
        String max = maximumTest.maximum("murari","kumar","patna");
        System.out.println(max);
        Assertions.assertEquals("patna",max);
    }
    @Test
    public void givenStringObjectGenericMethodShouldReturnMax()
    {
        String max = maximumTest.maximum("murari","kumar","patna");
        System.out.println(max);
        Assertions.assertEquals("patna",max);
    }
    @Test
    public void givenFloatObjectGenericMethodShouldReturnMax()
    {
        float max = maximumTest.maximum(4.5f,4.6f,4.7f);
        System.out.println(max);
        Assertions.assertEquals(4.7f,max);
    }
    @Test
    public void givenIntegerObjectGenericMethodShouldReturnMax()
    {
        int max = maximumTest.maximum(7,8,9);
        System.out.println(max);
        Assertions.assertEquals(9,max);
    }
    @Test
    public void givenFloatObjectGenericMethodShouldReturnMax2()
    {
        MaximumTest maximumTest = new MaximumTest(4.5f,4.6f,4.7f);
        float max = (float) maximumTest.maximum();
        System.out.println(max);
        Assertions.assertEquals(4.7f,max);
    }
    @Test
    public void givenIntegerObjectGenericMethodShouldReturnMax2()
    {
        MaximumTest maximumTest = new MaximumTest(7,8,9);
        int max = (int) maximumTest.maximum();
        System.out.println(max);
        Assertions.assertEquals(9,max);
    }
    @Test
    public void givenStringObjectGenericMethodShouldReturnMax2()
    {
        MaximumTest maximumTest = new MaximumTest("murari","kumar","patna");
        String max = (String) maximumTest.maximum();
        System.out.println(max);
        Assertions.assertEquals("patna",max);
    }




}
