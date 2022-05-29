public class LeArray
{
    public int findMinimum(int arr[])
    {
        if(arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0]; //min will hold minimum of array
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Mininmum: "+min);
        return min;
    }
    public int findMaximum(int arr[])
    {
        if((arr == null) || (arr.length == 0))
        {
            throw new IllegalArgumentException("Invalid Input");
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max= arr[i];
            }
        }
        System.out.println("Maximum Number: "+ max);
        return max;
    }
    public float findAverage(int arr[])
    {
        float avg = 0;
        float total = 0;
        for(int i = 0; i< arr.length; i++)
        {
            total =total + arr[i];
        }
        avg = total / arr.length;
        System.out.println("Average: "+avg);
        return avg;
    }
    public void PrintArray(int[] arr)
    {
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void reverse(int[] numbers, int start, int end)
    {
        while(start < end)
        {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public void arrayDemo()
    {
        int myArray[] = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        PrintArray(myArray);
        System.out.println(myArray[myArray.length - 1]);
    }

}
