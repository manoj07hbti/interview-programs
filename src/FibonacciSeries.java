public class FibonacciSeries {
//TODO The Fibonacci series is a series where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1.
    public static void main(String[] args) {

        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
        //TODO HERE WE HAVE TAKEN 0 AND 1 AS FIRST TWO ELEMENT OF SERIES AND N IS THE RANGE OF SERIES
        System.out.println("Fibonacci Series till " + n + " terms:");
        //TODO WE ARE GOING TO USE WHILE LOOP TO REPEAT THE BELOW LOGIC OF GENERATING NEXT TERM BY ADDING PREVIOUS TWO TERMS
        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;//TODO HERE WE ARE FINDING NEXT TERM BY ADDING PREVIOUS TWO TERMS
            firstTerm = secondTerm;// TODO HERE WE NEED TO MOVE FIRST TERM TO SECOND TERM SO WE CAN GENERATE NEXT TERM
            secondTerm = nextTerm;// TODO HERE WE NEED TO MOVE SECOND TERM TO NEXT TERM SO WE CAN MOVE FORWARD IN SERIES

            i++;
        }
    }
}
