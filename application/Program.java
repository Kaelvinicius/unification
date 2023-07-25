package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInt = Arrays.asList(1,2,3,4);
        List<Double> myDoub = Arrays.asList(3.14,22.78);
        List<Object> myObjt = new ArrayList<Object>();

        copy(myInt, myObjt);
        printList(myObjt);
        copy(myDoub, myObjt);
        printList(myObjt);

    }

    public static void copy(List<? extends  Number> source, List<? super Number> destiny){
        for(Number number : source){
            destiny.add(number);
        }
    }
    public static void printList(List<?> list){
        for(Object obj: list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}


