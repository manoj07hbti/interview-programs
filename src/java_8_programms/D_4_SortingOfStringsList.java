package java_8_programms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TODO sort string in natural and reverse order
public class D_4_SortingOfStringsList {

    public static void main(String[] args) {

        //TODO write a program to sort String in natural order
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        List<String> sortedList = stringList.stream()
                                            .sorted(Comparator.naturalOrder())
                                            .collect(Collectors.toList());
//TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
// we are using sorted method to do the sorting and also we are using comparator to specify order of sorting as natural order
// we are collecting output as a List so we are using Collectors.ToList() inside collect
        System.out.println("Sorted List in natural order: "+sortedList);

        //TODO write a program to sort String in reverse order
        List<String> reverseSortedList = stringList.stream()
                                                   .sorted(Comparator.reverseOrder())
                                                   .collect(Collectors.toList());
//TODO we are using .asList method to create list , after that we have created stream using stringList.stream() method
// we are using sorted method to do the sorting and also we are using Comparator.reverseOrder() to specify
// order of sorting as reverse order
// we are collecting output as a List so we are using Collectors.ToList() inside collect
        System.out.println("Sorted List in reverse order: "+reverseSortedList);
    }
}
