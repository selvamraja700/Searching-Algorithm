public class LinearSearch
{

    static int searchArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    // string linear search//
    static int searchCharacter(String s, char found) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == found) {
                return i;
            }

        }
        return -1;
    }

    //2 d array linear search//

    static int []search2dArray(int arr2[][],int target)
    {
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++)
            {
                if (arr2[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int [] {-1,-1};
    }


    public static void main(String[] args)
    {
        //one d array search//
        int arr[] = {1, 3, 21, 2, 45, 98};
        int target = 3;
        int result = searchArray(arr, target);
        if (result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println(target + " found at index = " + result);
        }
        //2d array search//
        String s = "mavles";
        char found = 'm';
        int charresult = searchCharacter(s, found);
        if (charresult == -1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("'" + found + "' found at index = " + charresult);
        }
        //2d array search//
        int arr2[][]={
                {12,54,78},
                {4,98,21},
                {44,55,66,98}
        };
        int target2d=66;
        int pos[]=search2dArray(arr2,target2d);
        {
            if (pos[0]==-1)
            {
                System.out.println("element not found");
            }
            else
            {
                System.out.println(target2d + " found at row = " + pos[0] + ", col = " + pos[1]);

            }
        }


    }
}
