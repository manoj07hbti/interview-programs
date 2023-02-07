package java_8_programms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO .	Write a program to sort a list of integers using the Stream API in Java 8.
public class C_SortListOfIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//TODO here we have created list object and we will add elements to it
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        //TODO We have used numbers.stream() to create stream from our list ,
        // after that we are using sorted() method, this method will do sorting in natural order
        // in last we are using terminal operation .collect() which will give use final result from stream
        // we are collecting result as a List here so we have use Collectors.toList() method
        System.out.println("Sorted list: " + sortedNumbers);
    }
}
