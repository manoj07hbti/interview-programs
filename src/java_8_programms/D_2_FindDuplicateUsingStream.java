package java_8_programms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//TODO find duplicate strings using stream SPI
public class D_2_FindDuplicateUsingStream {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        List<String> duplicateString = stringList
                .stream()
                .filter(string -> Collections.frequency(stringList, string) > 1).distinct()
                .collect(Collectors.toList());
//TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
// after that we have used intermediate operation filter and we are using lambda expression to get the duplicate string
// we are using Collectors.frequency method and we are paring list of string stringList and particular string
// and also we are comparing is frequency is greater than 1 mean it is duplicate we will be using terminal operation collect
// and we are avoiding duplicate in results so we are using distinct method
// where we are collecting output as a List so we are using Collectors.ToList() inside collect
        System.out.println(duplicateString);


    }
}
