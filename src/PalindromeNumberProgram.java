public class PalindromeNumberProgram {
//TODO a number that is equal to the reverse of that same number is called a palindrome number.
// For example, 3553, 12321, etc.
    public static void main(String[] args) {

        int num = 3553, reversedNum = 0, remainder;

        //TODO store the number to originalNum , WE WILL USE originalNum TO EXTRACT EVERY DIGIT FROM IT
        int originalNum = num;

        //TODO HERE WE ARE GOING TO WRITE LOGIC TO REVERSE OF originalNum
        while (num != 0) { //TODO WE ARE GOING TO RUN THIS LOGIC UNTIL IT REACHES TO 0
            remainder = num % 10;// TODO HERE WE ARE TRYING TO GET LAST DIGIT OF NUMBER
            reversedNum = reversedNum * 10 + remainder;//TODO HERE WE ARE TRYING TO SHIFT THE DIGIT TO PREVIOUS DIGIT SO THAT WE CAN HAVE ENTIRE REVERSED NUMBER
            num /= 10;//TODO HERE WE ARE TRYING TO PICK ANOTHER DIGIT BY MOVING TO NEXT DIGIT AFTER DIVIDE
        }

        //TODO HERE WE ARE CHECKING IF reversedNum AND originalNum ARE EQUAL IT MEANS IT IS PALINDROME
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }// TODO IF IT IS NOT THEN IT IS NOT PALINDROME NUMBER
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }

    }
}
