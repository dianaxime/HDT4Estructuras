/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIANA
 */
public class SingleListTest {
    
    /*public SingleListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class SingleList.
     */
   /* @Test
    public void testSize() {
        System.out.println("size");
        SingleList instance = new SingleList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class SingleList.
     */
    /*@Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        SingleList instance = new SingleList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class SingleList.
     */
    /*@Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SingleList instance = new SingleList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class SingleList.
     */
    /*@Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        SingleList instance = new SingleList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class SingleList.
     */
    /*@Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SingleList instance = new SingleList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class SingleList.
     */
    /*@Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        SingleList instance = new SingleList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
     @Test
        public void testSize() {
            SingleList<Integer> list = new SingleList<>();
            list.addLast(10);
            list.addLast(2);
            list.addLast(17);
            int a=list.size();
            assertEquals(a,3);
        }
        @Test
        public void testRemoveLast() {
            SingleList<Integer> list = new SingleList<>();
            list.addLast(10);
            list.addLast(2);
            list.addLast(17);
            int a=list.removeLast();
            assertEquals(a,17);
        }
    
}
