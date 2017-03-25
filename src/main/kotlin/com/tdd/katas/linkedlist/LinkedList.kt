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
            if (elements[i]!!.value == element) {
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
        return true
    }

}