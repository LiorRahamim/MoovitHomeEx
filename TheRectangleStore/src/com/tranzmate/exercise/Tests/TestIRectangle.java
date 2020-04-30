package com.tranzmate.exercise.Tests;
import com.tranzmate.exercise.BoringRectangle;
import com.tranzmate.exercise.IRectangle;
import com.tranzmate.exercise.RectangleStoreMoovit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestIRectangle {
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
        assertTrue(IRectangle.isBetween(1,3,2));
        assertFalse(IRectangle.isBetween(1,2,3));
    }

    @Test
    public void testIsPointWithin(){
        assertTrue(r3.isPointWithin(7, 20));
        assertFalse(r3.isPointWithin(2,2));
    }

    @Test
    public void testIsRectangleWithin(){
        assertTrue(r1.isRectangleWithin(r3));
        assertFalse(r1.isRectangleWithin(r2));
    }

    @Test
    public void testIsRectangleProper(){
        assertTrue(r1.isRectangleProper());
        assertTrue(r3.isRectangleProper());
        assertFalse(r4.isRectangleProper());
    }
}
