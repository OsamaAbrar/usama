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
    public void insetTest() {
        B.insert(5);
        B.insert(6);
        B.insert(8);
        B.insert(4);
        assertNotNull( B.search(5));
        assertNotNull( B.search(6));
        assertNotNull( B.search(8));
        assertNotNull( B.search(4));

    }


}

