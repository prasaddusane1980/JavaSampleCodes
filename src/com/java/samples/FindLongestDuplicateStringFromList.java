package com.java.samples;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


//List with color names
//find  color name with max lenght among the the duplicates  colorsusing java 8
public class FindLongestDuplicateStringFromList {
    public static void main(String[] args) {
        List<String> clrList = new ArrayList<>();
        clrList.add("Red");
        clrList.add("Green");
        clrList.add("Blue");
        clrList.add("Red");
        clrList.add("Green");

        Map<String, Long> freq = clrList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(freq);
        String maxKey = freq.entrySet().stream()
                .max(Comparator.comparingInt(entry -> entry.getKey().length()))
                .get().getKey();
        System.out.println(maxKey);
    }

}
