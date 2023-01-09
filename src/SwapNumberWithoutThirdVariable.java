public class SwapNumberWithoutThirdVariable {

    public static void main(String[] args) {

        //TODO FIRST APPROACH : The numbers can then be swapped using the sum and subtraction from the sum.
        int x = 10;//TODO HERE WE HAVE USED FIRST VARIABLE
        int y = 5; //TODO HERE IS THE SECOND VARIABLE
        x = x + y; //TODO X=10+5=15 HERE WE ARE ADDING BOTH NUMBERS SO WE CAN GET THE TOTAL SUM (X) WHICH WE WILL USE FURTHER
        y = x - y; //TODO Y=15-5=10 IF WE SUBTRACT Y FROM X THEN WE ARE GOING TO GET THE FIRST NUMBER AND IT'S REPLACED IN Y
        x = x - y; //TODO X=15-10=5 NOW WE HAVE SECOND NUMBER IN Y SO IF WE WILL SUBTRACT Y FROM X SO FINALLY WE WILL GET SECOND NUMBER AS WELL
        System.out.println("SWAPPING USING ADDITION AND SUBTRACTION After swapping:"
                + " x = " + x + ", y = " + y);

        //TODO SECOND APPROACH:USING MULTIPLICATION AND DIVIDE

        int a = 10;
        int b = 5;

        //TODO Code to swap 'a' and 'b'
        a = a * b; //TODO a now becomes 50
        y = a / b; //TODO b becomes 10
        a = a / b; //TODO a becomes 5

        System.out.println("USING MULTIPLICATION AND DIVIDE After swapping:"
                + " x = " + x + ", y = " + y);
    }
}
