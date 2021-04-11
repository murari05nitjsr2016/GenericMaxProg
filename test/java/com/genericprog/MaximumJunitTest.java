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
}
