package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {
    public static void countFrequenceOfWorldInString(String sentence) {
        if (sentence==null) throw new IllegalArgumentException("String cannot be null");
        String[] stringArray = sentence.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<stringArray.length;i++){
            map.put(stringArray[i],map.getOrDefault(stringArray[i],0)+1);
        }
        map.entrySet().stream().sorted((o1, o2) -> o2.getValue()-o1.getValue()).forEach((e)->{
            System.out.println(e.getKey() + " : "+e.getValue());
        });
    }

    public static void reverseList(ArrayList<Integer> list) {
        if (list==null) throw new IllegalArgumentException("list cannot be null");
        int start =0;
        int end = list.size()-1;
        while (start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }

    public static void convertListIntoSet(List<Integer> list) {
        if (list ==null) throw new IllegalArgumentException("list cannot be null");
        System.out.println("list : " + list.toString());
        Set<Integer> uniqueElement  = list.stream().collect(Collectors.toSet());
        uniqueElement.stream().forEach(e->{
            System.out.println("unique element : " +e);
        });
    }

    public static void countFrequenceOfCharacterInString(String string) {
        if (string==null) throw new IllegalArgumentException(" string cannot be nll");
        Map<Character,Integer> mapFrequency = new HashMap<>();
        for(char character: string.toCharArray()){
            mapFrequency.put(character,mapFrequency.getOrDefault(character,0)+1);
        }
        mapFrequency.entrySet().stream().forEach(mapset->{
            System.out.println(mapset.getKey() + " : " + mapset.getValue());
        });
    }


    public static <T> void swapTwoElement(T[] array, int indexOne, int indextwo) {
        if (array==null){
            throw new IllegalArgumentException("array cannot be null");
        }
        if (indexOne > array.length-1 && indextwo > array.length-1){
            throw new IllegalArgumentException("index size should greater than array size ");
        }
        System.out.println("Before swap ");
        printElement(array);
        T temp = array[indexOne];
        array[indexOne] =array[indextwo];
        array[indextwo] =temp;
        System.out.println("After swap ");
        printElement(array);
    }

    public static <T> void printElement(T[] array){
        if (array==null) throw new IllegalArgumentException("array cannot be null");
        int index=0;
        for(T element : array){
            System.out.println("Element"+ index +" :" + element);
            index++;
        }
    }

    public static <T> void printList(List<T> list){
        if(list==null){
            throw new IllegalArgumentException("list cannot be null");
        }
        list.stream().forEach(element->{
            System.out.println("element : "+element);
        });
    }

    public static <T> void mergeTwoListOfSameType(List<T> listIntegerOne, List<T> listIntegertwo) {
        if (listIntegerOne==null || listIntegertwo==null) throw new IllegalArgumentException("list cannot be null");
        List<T> mergeList =new ArrayList<>();
        mergeList.addAll(listIntegerOne);
        mergeList.addAll(listIntegertwo);
        System.out.println("before merge list 1 : ");
        printList(listIntegerOne);
        System.out.println("before merge list 2 : ");
        printList(listIntegertwo);
        System.out.println("After merged : ");
        printList(mergeList);
    }
}


