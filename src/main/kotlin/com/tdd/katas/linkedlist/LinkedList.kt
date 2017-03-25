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
        if (isEmpty()) {
            val node : Node = Node(element, null, null)

            val nodeIndex = size;

            elements[nodeIndex] = node
            firstIndex = nodeIndex
            lastIndex = nodeIndex

            size++
        }
        else {
            val lastNode = elements[lastIndex!!]

            val nodeIndex = size;

            lastNode!!.next = nodeIndex

            val node : Node = Node(element, lastIndex, null)
            elements[nodeIndex] = node
            size++

            lastIndex = nodeIndex
        }
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

}