package com.tdd.katas.linkedlist

class LinkedList {

    private var empty : Boolean = true
    private var size : Int = 0

    fun  isEmpty(): Boolean {
        return empty
    }

    fun  size(): Int {
        return size
    }

    fun  add(element: String) {
        size++
        empty = false
    }

}