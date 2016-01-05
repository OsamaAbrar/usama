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
    public void SearchTest() {
        B.insert(1);
        B.insert(2);
        B.insert(3);
        B.insert(4);
        assertNotNull( B.search(1));
        assertNotNull( B.search(2));
        assertNotNull( B.search(3));
        assertNotNull( B.search(4));


    }

}