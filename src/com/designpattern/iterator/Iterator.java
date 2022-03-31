package com.designpattern.iterator;

interface Iterator<E> {
    E first();
    E next();
    boolean hasNext();
}