public class PalindromeStringProgram {

    public static void main(String[] args) {
//TODO A string is called a palindrome string if the reverse of that string is the same as the original string. For example, radar, level, etc.

        String str = "Radar", reverseStr = ""; //TODO HERE WE HAVE TAKEN TWO VARIABLE , REVERESTR WILL HAVE REVERSED STRING OF INPUT STRING

        int strLength = str.length(); //TODO HERE WE ARE TAKING LENGTH WHICH WE WILL USE INTO FOR LOOP TO ITERATE EVERY CHARACTER OF STRING

        for (int i = (strLength - 1); i >=0; --i) {
        //TODO HERE WE ARE ITERATING EVERY CHARACTER OF STRING STARTING FROM LAST TO FIRST CHARACTER
            reverseStr = reverseStr + str.charAt(i);//TODO HERE WE ARE CONCATENATING CHARACTERS IN REVERSE ORDER SO THAT WE CAN GET REVERED STRING
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase()))
        /*TODO HERE WE ARE COMPARING STRING MAKING IN LOWER CASE SO WE CAN COMPARE PROPERLY AND
            IF ACTUAL STRING AND REVERED STRINGS ARE SAME THEN STRING IS PALINDROME STRING */
        {
            System.out.println(str + " is a Palindrome String.");
        }
        else {// TODO IF ACTUAL STRING AND REVERED STRINGS ARE "NOT" SAME THEN STRING IS "NOT" PALINDROME STRING
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
