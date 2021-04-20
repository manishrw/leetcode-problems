package dsa.utils;

import java.util.Objects;

public class Pair<X, Y> {
    private X key;
    private Y value;

    public Pair(final X key, final Y value) {
        this.key = key;
        this.value = value;
    }

    public X getKey() {
        return key;
    }

    public Y getValue() {
        return value;
    }

    public Pair<X, Y> left(X key) {
        this.key = key;
        return this;
    }

    public Pair<X, Y> right(Y value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " left='" + key + "'" +
            ", right='" + value + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<X, Y> pair = (Pair<X, Y>) o;
        return key == pair.key && value == pair.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

}
