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
public class MyArrayTest {
    
    /*public MyArrayTest() {
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
     * Test of push method, of class MyArray.
     */
    /*@Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        MyArray instance = new MyArray();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class MyArray.
     */
    /*@Test
    public void testPop() {
        System.out.println("pop");
        MyArray instance = new MyArray();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class MyArray.
     */
    /*@Test
    public void testPeek() {
        System.out.println("peek");
        MyArray instance = new MyArray();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MyArray.
     */
    /*@Test
    public void testSize() {
        System.out.println("size");
        MyArray instance = new MyArray();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class MyArray.
     */
    /*@Test
    public void testEmpty() {
        System.out.println("empty");
        MyArray instance = new MyArray();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
     @Test
        public void testPush() {
            MyArray<Integer> fifo = new MyArray<>();
            fifo.push(5);
            fifo.push(11);
            int a=fifo.peek();
            assertEquals(a,11);
        }
    @Test
        public void testPop() {
            MyArray<Integer> fifo = new MyArray<>();
            fifo.push(77);
            fifo.push(2);
            fifo.push(9);
            fifo.push(8);
            int a=fifo.pop();
            assertEquals(a,8);
        }
    @Test
        public void testSize() {
            MyArray<Integer> fifo = new MyArray<>();
            fifo.push(10);
            fifo.push(7);
            int a=fifo.size();
            assertEquals(a,2);
        }
    @Test
        public void testEmpty() {
            MyArray<Integer> fifo = new MyArray<>();
            fifo.push(10);
            boolean a=fifo.empty();
            assertEquals(a,false);
        }
    
}
