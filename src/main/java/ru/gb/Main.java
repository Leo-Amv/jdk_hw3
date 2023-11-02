package ru.gb;

public class Main {
    public static void main(String[] args) {
        GenericArray<String> strArr = new GenericArray<>(new String[]{"awd","asdwqe","1233"});
        Integer [] arr1 = {1,2,3,4,5};
        Integer [] arr2 = {1,2,3,4,5};
        System.out.println(compareArrays(arr1,arr2));
    }
    public static  <T> boolean compareArrays(T[] arr1,T[] arr2){
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}