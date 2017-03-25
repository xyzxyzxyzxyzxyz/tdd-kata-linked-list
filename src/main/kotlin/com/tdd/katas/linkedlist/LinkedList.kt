package com.tdd.katas.linkedlist

class LinkedList {

    private var empty : Boolean = true;

    fun  isEmpty(): Boolean {
        return empty
    }

    fun  size(): Int {
        return 0
    }

    fun  add(element: String) {
        empty = false
    }

}