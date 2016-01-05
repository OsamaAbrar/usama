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
    public void deleteNodeTest() {
        B.insert(12);
        B.insert(13);
        B.insert(33);
        B.insert(17);
        assertNotNull(B.deleteNode(12));
        assertNotNull(B.deleteNode(13));
        assertNotNull(B.deleteNode(33));
        assertNotNull(B.deleteNode(17));

    }


}

