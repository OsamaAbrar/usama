package com.A.M;

import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.*;
import org.junit.runners.MethodSorters;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryTest {
    public BinaryTest<Integer> B=null;
    @Before
    public void ini() {
        B=new BInaryTest<Integer>();
    }
    @Test
    public void InOrder()
    {
        String expected="3,5,4,6,7,8";
        String output=B.printInorder();
        assertTrue(expected.equals(output));
    }

}