package com.tdd.katas.linkedlist

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class LinkedListTest {

    /*
        boolean 	add(E e)
        Appends the specified element to the end of this list.

        void 	clear()
        Removes all of the elements from this list.

        E 	get(int index)
        Returns the element at the specified position in this list.

        boolean 	contains(Object o)
        Returns true if this list contains the specified element.

        E 	remove()
        Retrieves and removes the head (first element) of this list.

        int 	size()
        Returns the number of elements in this list.

        boolean 	isEmpty()
        Returns true if this collection contains no elements.
     */

    var list = LinkedList()

    @Before
    fun setUp() {
        list = LinkedList()
    }

    @Test
    fun whenCreatedTheLinkedListMustBeEmpty() {
        assertTrue("Should be empty", list.isEmpty())
    }

    @Test
    fun whenAddingAnElementTheLinkedListShouldNotBeEmpty() {
        list.add("one")

        assertFalse("Should not be empty", list.isEmpty())
    }

    @Test
    fun whenAddingAnElementTheSizeShouldNotBeZero() {
        list.add("one")

        assertEquals("Should not be zero", 1, list.size())
    }

    @Test
    fun whenCreatedTheLinkedListShouldHaveSizeZero() {
        assertEquals("Should be zero", 0, list.size())
    }

    @Test
    fun whenTheListIsClearedTheSizeMustBeZero() {
        list.add("one")
        list.clear()

        assertEquals("Should be zero", 0, list.size())
    }

    @Test
    fun whenTheListIsClearedItMustBeEmpty() {
        list.add("one")
        list.clear()

        assertTrue("Should be empty", list.isEmpty())
    }

    @Test
    fun whenAddingAnElementItMustBeContainedInTheList() {
        list.add("one")

        assertTrue("Should contain one", list.contains("one"))
    }

}