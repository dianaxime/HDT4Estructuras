/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

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
public class DListTest {
    
    /*public DListTest() {
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
     * Test of addFirst method, of class DList.
     */
    /*@Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        DList instance = new DList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class DList.
     */
    /*@Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        DList instance = new DList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class DList.
     */
    /*@Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DList instance = new DList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class DList.
     */
    /*@Test
    public void testSize() {
        System.out.println("size");
        DList instance = new DList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class DList.
     */
    /*@Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DList instance = new DList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class DList.
     */
    /*@Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DList instance = new DList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
        public void testSize() {
            DList<Integer> list = new DList<>();
            list.addLast(0);
            list.addLast(8);
            list.addLast(9);
            list.addLast(3);
            list.addLast(1);
            list.addLast(2);
            list.addLast(7);
            int a=list.size();
            assertEquals(a,7);
        }
        @Test
        public void testRemoveLast() {
            DList<Integer> list = new DList<>();
            list.addLast(0);
            list.addLast(8);
            list.addLast(9);
            list.addLast(3);
            list.addLast(1);
            int a=list.removeLast();
            assertEquals(a,1);
        }
    
}
