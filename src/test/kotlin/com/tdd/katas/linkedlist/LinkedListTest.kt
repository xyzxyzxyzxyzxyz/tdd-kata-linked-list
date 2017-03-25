package com.tdd.katas.linkedlist

import org.junit.Test
import org.junit.Assert.*

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


    @Test
    fun whenCreatedTheLinkedListMustBeEmpty() {
        val list : LinkedList = LinkedList()

        assertTrue("Should be empty", list.isEmpty())
    }

    @Test
    fun whenAddingAnElementTheLinkedListShouldNotBeEmpty() {
        val list : LinkedList = LinkedList()

        list.add("one")

        assertFalse("Should not be empty", list.isEmpty())
    }

    @Test
    fun whenAddingAnElementTheSizeShouldNotBeZero() {
        val list : LinkedList = LinkedList()

        list.add("one")

        assertEquals("Should not be zero", 1, list.size())
    }

    @Test
    fun whenCreatedTheLinkedListShouldHaveSizeZero() {
        val list : LinkedList = LinkedList()

        assertEquals("Should be zero", 0, list.size())
    }

    @Test
    fun whenTheListIsClearedTheSizeMustBeZero() {
        val list : LinkedList = LinkedList()

        list.add("one")
        list.clear()

        assertEquals("Should be zero", 0, list.size())
    }



}