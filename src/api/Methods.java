package api;

import java.util.Arrays;

public class Methods {
 
    static String nextBigger(char arr[], int n)
    {
        int i;
        String str=null; 
        // find first smaller digit 
        for (i = n - 1; i > 0; i--)
        {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }
         
        //If not possible to generate such number
        if (i == 0)
        {
            str="No answer";
        }
        else
        {
            int x = arr[i - 1], min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] > x && arr[j] < arr[min])
                {
                    min = j;
                }
            }
 
            // Swap smallest digit found with number[i-1]
            swap(arr, i - 1, min);
            //Sorting the digits 
            Arrays.sort(arr, i, n);
            str=new String(arr);
        }
		return str;
    }
    
    static void swap(char arr[], int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}