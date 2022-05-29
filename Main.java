public class Main {
    public static void main(String[] args)
    {
        LeArray arrUtil = new LeArray();
        int arr[] = {1,2,3,4,5};
        arrUtil.arrayDemo();
        arrUtil.reverse(arr,0,arr.length - 1);
        arrUtil.PrintArray(arr);
        arrUtil.findMinimum(arr);
        arrUtil.findMaximum(arr);
        arrUtil.findAverage(arr);
    }
}
