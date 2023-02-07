package java_8_programms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class D_5_Count_Letters_In_String {
    public static void main(String[] args) {


        String input = "Hello World";
        Map<Character, Long> letterCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//TODO This code uses the chars() method to convert the input String into a stream of characters. The mapToObj method
// is then used to convert the int values of the characters into actual characters.
// Finally, the groupingBy collector is used to group the characters by their identity, and count them using the
// counting collector. The result is stored in a Map with the characters as keys and the counts as values.

        System.out.println(letterCounts);
    }
}
