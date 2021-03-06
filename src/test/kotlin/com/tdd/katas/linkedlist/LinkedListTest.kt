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

    @Test
    fun whenAnElementHasNotBeenAddedToTheListTheContainsMethodMustReturnFalse() {
        list.add("one")

        assertFalse("Should not contain two", list.contains("two"))
    }

    @Test
    fun whenAddingTwoElementsTheyMustBeContainedInTheList() {
        list.add("one")
        list.add("two")

        assertTrue("Should contain one", list.contains("one"))
        assertTrue("Should contain two", list.contains("two"))
    }

    @Test
    fun whenRemovingAnExistingElementTheRemoveMethodReturnsTrue() {
        list.add("two")

        assertTrue("Should return true", list.remove("two"))
    }

    @Test
    fun whenRemovingANonExistingElementTheRemoveMethodReturnsFalse() {
        list.add("two")

        assertFalse("Should return false", list.remove("one"))
    }

    @Test
    fun whenRemovingAnExistingElementTheSizeIsDecreased() {
        list.add("one")
        list.add("two")
        list.add("three")

        list.remove("two")

        assertEquals("Size should be two", 2, list.size())
    }

    @Test
    fun whenRemovingADuplicatedElementTheSizeIsDecreasedOnlyByOne() {
        list.add("one")
        list.add("one")
        list.add("one")

        list.remove("one")

        assertEquals("Size should be two", 2, list.size())
    }

    @Test
    fun whenRemovingANonExistingElementTheSizeIsNotDecreased() {
        list.add("one")
        list.add("two")
        list.add("three")

        list.remove("four")

        assertEquals("Size should be three", 3, list.size())
    }

    @Test
    fun afterRemovingAUniqueElementItIsNotContainedAnymore() {
        list.add("one")
        list.add("two")
        list.add("three")

        list.remove("two")

        assertFalse("Should not contain two", list.contains("two"))
    }

    @Test
    fun afterRemovingADuplicatedElementOnlyOneOccurrenceIsRemoved() {
        list.add("one")
        list.add("one")
        list.add("one")

        list.remove("one")

        assertTrue("Still contains one", list.contains("one"))
    }




}