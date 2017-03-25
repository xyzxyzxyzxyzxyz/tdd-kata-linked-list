package com.tdd.katas.linkedlist

class LinkedList {


    private var elements : Array<String?> = arrayOfNulls(10)
    private var size : Int = 0

    fun isEmpty(): Boolean {
        return size==0
    }

    fun size(): Int {
        return size
    }

    fun add(element: String) {
        elements[size] = element
        size++
    }

    fun clear() {
        size = 0
    }

    fun contains(element: String): Boolean {
        for (i in 0..size) {
            if (elements[i] == element) {
                return true
            }
        }

        return false
    }

}