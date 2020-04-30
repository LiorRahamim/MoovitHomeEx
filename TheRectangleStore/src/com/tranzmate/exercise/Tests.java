package com.tranzmate.exercise;
import com.tranzmate.exercise.BoringRectangle;
import com.tranzmate.exercise.RectangleStoreMoovit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
//    String[] urls;
//    String path; // path to url text file
//    String first_url;
//    String bad_url;
//
    BoringRectangle r1;
    BoringRectangle r2;
    BoringRectangle r3;
    BoringRectangle r4;

    @Before
    public void setUp() {
        r1 = new BoringRectangle(1,6,3,4);
        r2 = new BoringRectangle(1,6,3,4);
        r3 = new BoringRectangle(0,25,15,2);
        r4 = new BoringRectangle(10,25,1,2);
    }

    @Test
    public void testBoringRectangle() {
        assertEquals(r1.toString(), r2.toString());
        assertNotEquals(r2.toString(), r3.toString());
    }

    @Test
    public void testIsBetween(){
        assertTrue(RectangleStoreMoovit.isBetween(1,3,2));
        assertFalse(RectangleStoreMoovit.isBetween(1,2,3));
    }

    @Test
    public void testIsPointWithin(){
        assertTrue(RectangleStoreMoovit.isPointWithin(7, 20, r3));
        assertFalse(RectangleStoreMoovit.isPointWithin(2,2, r3));
    }

    @Test
    public void testIsRectangleWithin(){
        assertTrue(RectangleStoreMoovit.isRectangleWithin(r1, r3));
        assertFalse(RectangleStoreMoovit.isRectangleWithin(r1, r2));
    }

    @Test
    public void testIsRectangleProper(){
        assertTrue(RectangleStoreMoovit.isRectangleProper(r1));
        assertTrue(RectangleStoreMoovit.isRectangleProper(r3));
        assertFalse(RectangleStoreMoovit.isRectangleProper(r4));
    }
}
