package ru.gb;

import java.io.InputStream;
import java.io.Serializable;

//Создать обобщенный класс с тремя параметрами (T, V, K).
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
//Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String), V должен реализовать интерфейс DataInput и расширять класс InputStream, K должен расширять класс Number
public class GenericClass <T extends Comparable<String>, V extends InputStream & Serializable , K extends Number> {
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getInfo(){
        System.out.printf("%s, %s, %s",t.getClass().getName(),v.getClass().getName(),k.getClass().getName());
    }
}
