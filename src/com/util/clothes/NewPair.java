package com.util.clothes;

public class NewPair<T> {
    private T left;
    private T right;

    public NewPair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getL() {
        return left;
    }

    public T getR() {
        return right;
    }

    @Override
    public String toString() {
        return "(l, r) = (" + left.getClass().getSimpleName() + ", " + right.getClass().getSimpleName() + ")";
    }
}


