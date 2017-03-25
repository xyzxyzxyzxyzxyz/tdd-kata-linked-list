package com.tdd.katas.linkedlist

class LinkedList {

    private var elements : Array<Node?> = arrayOfNulls(10)
    private var size : Int = 0

    private var firstIndex : Int? = null
    private var lastIndex : Int? = null

    fun isEmpty(): Boolean {
        return size==0
    }

    fun size(): Int {
        return size
    }

    fun add(element: String) {

        // Deciding the position of the new node
        val nodeIndex = size;

        // Locating the last node
        if (!isEmpty()) {
            // There is last node only if the list is not empty
            var lastNode : Node? = elements[lastIndex!!]
            // Linking the last node to the new, with the new as next
            lastNode!!.next = nodeIndex
        }

        // Creating the new node
        // Pointing the new node to last node as previous
        // Pointing the new node to nothing as next
        val node : Node = Node(element, lastIndex, null)        // lastIndex will be null when list is empty

        // Storing the new node
        elements[nodeIndex] = node
        size++

        if (isEmpty()) {
            // Pointing the new node as the first
            firstIndex = nodeIndex
        }

        // Updating the lastIndex pointer to the new node
        lastIndex = nodeIndex
    }

    fun clear() {
        size = 0
    }

    fun contains(element: String): Boolean {
        for (i in 0 .. size-1) {
            if (elements[i]!=null && elements[i]!!.value == element) {
                return true
            }
        }

        return false
    }


    class Node {
        constructor(value: String?, previous: Int?, next: Int?) {
            this.value = value
            this.previous = previous
            this.next = next
        }

        var value : String? = null
        var previous : Int? = null
        var next : Int? = null
    }

    fun remove(element: String): Boolean {
        // Locate the element to be removed
        val elementIndex = indexOf(element)

        // If it doesn't exist, get out
        if (elementIndex == -1) {
            return false
        }

        // The element exists

        // Locate the node to be removed
        val nodeToBeRemoved = elements[elementIndex]

        // Locate the previous node, if it exists
        var previousNode : Node? = null
        if (nodeToBeRemoved!!.previous!=null) {
            previousNode = elements[nodeToBeRemoved!!.previous!!]
        }

        // If there is a previous node, change its "next" pointer to the node next to the one to be removed
        if (previousNode!=null) {
            previousNode.next = nodeToBeRemoved.next        // If the node is the last, now the previous is the last
        }

        // Locate the next node, if it exists
        var nextNode : Node? = null
        if (nodeToBeRemoved!!.next!=null) {
            nextNode = elements[nodeToBeRemoved!!.next!!]
        }

        // If there is a next node, change its "previous" pointer to the node previous to the one to be removed
        if (nextNode!=null) {
            nextNode.previous = nodeToBeRemoved.previous    // If the node is the first, now the next is the first
        }

        // If node is first, now the next will be first
        if (nodeToBeRemoved.previous == null) {
            // If there is no next node, as I am the first, now the list will be empty
            // There will be no first node
            firstIndex =  nodeToBeRemoved.next
        }

        // If node is last, now the previous will be last
        if (nodeToBeRemoved.next == null) {
            // If there is no previous node, as I am the last, now the list will be empty
            // There will be no last node
            lastIndex =  nodeToBeRemoved.previous
        }

        // Remove the node from the array
        elements[elementIndex] = null
        size--

        // Return true, because the element needed to be removed
        return true
    }

    private fun indexOf(element: String) : Int {
        for (i in 0 .. size-1) {
            if (elements[i]!=null && elements[i]!!.value == element) {
                return i
            }
        }

        return -1
    }

}