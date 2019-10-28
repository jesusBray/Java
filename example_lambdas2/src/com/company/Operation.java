package com.company;

@FunctionalInterface
public interface Operation<T> {

    public T calcular(T value1, T value2);
}
