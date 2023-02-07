package java_8_programms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO find string with length higher than 5
public class D_3_FindStringWithLengthHigherThanFive {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("stream");
        strings.add("api");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
//TODO here we have created stream from list of String using strings.stream() ,
// after that we are using intermediate operation filter and passing lambda expression
// in this lambda s is a String input and after arrow we are checking length of String greater than 5
// if any string matches this condition then it will be filtered and we will be using terminal operation collect
// where we are collecting output as a List so we are using Collectors.ToList() inside collect
        System.out.println("Strings with length greater than 5: " + filteredStrings);
    }


}
