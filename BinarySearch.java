public class BinarySearch
{
   static int searchValue(int arr[],int target)
   {
       int start=0;
       int end=arr.length-1;
       while (start<=end)
       {
           int middle=(start+end)/2;
           if (arr[middle]>target)
           {
               end=middle-1;
           }
           else if (arr[middle]<target)
           {
              start=middle+1;

           }
           else
           {
               return middle;
           }
       }
       return -1;
   }

    public static void main(String[] args)
    {
         int arr[]={2,3,4,5,6,7,8,9,10};
         int target=2;
         int result=searchValue(arr,target);
         if (result==-1)
         {
             System.out.println("Element not found");
         }
         else
         {
             System.out.println(target+ " Target element found at index of "+result);
         }

    }
}
