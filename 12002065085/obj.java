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
        B=new BinaryTest<Integer>();
    }
    @Test
    public void initializeObjectTest() {
        B = new BinaryTest<Integer>();
        assertNotNull("Object Failed", B);

    }
}
