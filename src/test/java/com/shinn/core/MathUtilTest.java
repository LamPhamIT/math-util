package com.shinn.core;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
}