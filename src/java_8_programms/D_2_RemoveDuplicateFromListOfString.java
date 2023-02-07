package java_8_programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TODO remove duplicate from String using stream API

public class D_2_RemoveDuplicateFromListOfString {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "apple", "banana");

        List<String> distinctString = stringList
                .stream()
                .distinct()
                .collect(Collectors.toList());

//TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
// and we are avoiding duplicate in results so we are using distinct method
// where we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println(distinctString);

    }


}
