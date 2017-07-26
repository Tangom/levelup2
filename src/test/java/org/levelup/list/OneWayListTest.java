package org.levelup.list;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Protsko D.
 */
public class OneWayListTest {

    private List<String> list;

    @Before
    public void setup() {
        list = new OneWayList<>();
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add("Some string");
        assertEquals(1, list.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("Some string");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testAdd() {
        // when
        boolean result = list.add("String1");

        // then
        assertTrue(result);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
    }

    //
    // Tests for method "get(int index)"
    //

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithNegativeIndex() {
        list.get(-3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithIndexMoreThanSize() {
        list.add("Some string1");
        list.add("Some string2");
        list.add("Some string3");
        list.add("Some string4");

        list.get(4);
    }

    @Test
    public void testGet() {
        list.add("Some string1");
        list.add("Some string2");
        list.add("Some string3");

        assertEquals("Some string1", list.get(0));
        assertEquals("Some string2", list.get(1));
        assertEquals("Some string3", list.get(2));
    }

    //
    // Tests for method "remove(int index)"
    //

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithNegativeIndex() {
        list.remove(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithIndexMoreThanSize() {
        list.add("some string1");
        list.remove(1);
    }

    @Test
    public void testRemove() {
        list.add("Some string1");
        assertEquals("Some string1", list.remove(0));
        assertEquals(0, list.size());

        list.add("Some string2");
        list.add("Some string3");

        assertEquals("Some string2", list.remove(0));
        assertEquals(1, list.size());
    }


}
