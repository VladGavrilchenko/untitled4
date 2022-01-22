package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> guitarIntegerMap= new ArrayList<>();

        guitarIntegerMap.add("2");

        guitarIntegerMap.add("2");
        guitarIntegerMap.add("2");
        guitarIntegerMap.remove("2");
        System.out.println(guitarIntegerMap.get(0));
        System.out.println(guitarIntegerMap.get(1));
    }
}
