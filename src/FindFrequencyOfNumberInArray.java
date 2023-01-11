import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfNumberInArray {

    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();
//TODO  HERE WE WILL BE USING HASH MAP TO STORE NUMBER AND IT'S OCCURRENCE , WE ARE USING KEY AS NUMBER AND VALUE AS OCCURRENCE


        for (int i = 0; i < n; i++)//TODO HERE WE ARE TRAVERSING ALL THE ELEMENTS OF ARRAY USING LOOP
        {
            if (mp.containsKey(arr[i]))//TODO HERR WE ARE CHECKING IF KEY IS ALREADY PRESENT IT MEAN WE NEED TO CHANGE THE OCCURRENCE
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);//TODO SO WE ARE GETTING THE OCCURRENCE OF NUMBER AND ADDING +1 AS THIS IS ALREADY AVAILABLE
            }
            else //TODO IF KEY IS NOT PRESENT IT MEANS IT'S A NEW NUMBER SO WE WILL SIMPLY PUT INTO MAP WITH 1 OCCURRENCE
            {
                mp.put(arr[i], 1);
            }
        }
        System.out.println(mp);//TODO PRINTING MAP WITH NUMBER AND OCCURRENCE
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
