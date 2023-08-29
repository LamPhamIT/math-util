package com.shinn.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class AdvanceMathUtilTest{

    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {6, 720}
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}
