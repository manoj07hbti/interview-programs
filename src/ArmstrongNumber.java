public class ArmstrongNumber {

    /*TODO n case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:
       //153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.*/

    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;
//TODO HERE WE HAVE TAKEN THESE VARIABLE TO STORE OUR RESULT , REMAINDER AND ORIGINAL NUMBER WHICH WE WILL USE FURTHER
        originalNumber = number;//TODO HERE WE ARE GOING TO USE ORIGINAL NUMBER TO EXTRACT EVERY DIGITS FROM IT

        while (originalNumber != 0)//TODO WE ARE GOING TO RUN THIS LOGIC UNTIL WE REACH TO 0
        {
            remainder = originalNumber % 10; //TODO HERE WE ARE TRYING TO EXTRACT LAST DIGIT FROM ORIGINAL NUMBER USING MODULUS OPERATOR
            result += Math.pow(remainder, 3);/*TODO HERE WE ARE DOING CUBE OF LAST DIGIT AND STORING TO RESULT , EVERY TIME WE WILL
                                                    ALSO STORE PREVIOUS SUM SO THAT WE CAN COMPARE WITH FINAL SUM WITH ACTUAL NUMBER*/
            originalNumber /= 10;//TODO HERE WE ARE TRYING TO GET THE SECOND DIGIT FROM GIVEN NUMBER SO WE CAN EXTRACT NEXT DIGIT
        }
//TODO AFTER THIS ALL CALCULATION WE HAVE CUBE OF EVERY DIGIT AND SUMMING IN RESULT VARAIBLE
        if(result == number)//TODO HERE WE ARE CHECKING IF RESULT SUM IS EQUAL TO THE ACTUAL NUMBER THEN IT IS ARMSTRONG NUMBER
            System.out.println(number + " is an Armstrong number.");
        else //TODO IF IT IS NOT EQUAL THEN DEIFNITLY IT IS NOT ARMSTRONG NUMBER
            System.out.println(number + " is not an Armstrong number.");
    }



}
