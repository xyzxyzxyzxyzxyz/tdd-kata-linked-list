package com.tdd.katas.linkedlist

class LinkedList {


    private var size : Int = 0

    fun isEmpty(): Boolean {
        return size==0
    }

    fun size(): Int {
        return size
    }

    fun add(element: String) {
        size++
    }

    fun clear() {
        size = 0
    }

    fun contains(element: String): Boolean {
        return false
    }

}