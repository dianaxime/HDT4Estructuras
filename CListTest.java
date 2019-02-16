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
public class CListTest {
    
    /*public CListTest() {
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
     * Test of addFirst method, of class CList.
     */
    /*@Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        CList instance = new CList();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class CList.
     */
    /*@Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        CList instance = new CList();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class CList.
     */
    /*@Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        CList instance = new CList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class CList.
     */
    /*@Test
    public void testSize() {
        System.out.println("size");
        CList instance = new CList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class CList.
     */
   /* @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        CList instance = new CList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class CList.
     */
   /* @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        CList instance = new CList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
        public void testSize() {
            CList<Integer> list = new CList<>();
            list.addLast(4);
            list.addLast(6);
            list.addLast(1);
            list.addLast(0);
            int a=list.size();
            assertEquals(a,4);
        }
        @Test
        public void testRemoveLast() {
            CList<Integer> list = new CList<>();
            list.addLast(0);
            list.addLast(1);
            list.addLast(52);
            int a=list.removeLast();
            assertEquals(a,52);
        }
}
