package ru.gb;

public class Pair<V,K> {
    private V v;
    private K k;

    public Pair(V v, K k) {
        this.v = v;
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "v=" + v.getClass().getName() +
                ", k=" + k.getClass().getName() +
                '}';
    }
}
