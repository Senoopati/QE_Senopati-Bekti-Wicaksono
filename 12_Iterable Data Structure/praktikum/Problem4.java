import java.util.ArrayList;
import java.util.List;

public class Problem4 {
     public static void uniqueArray(int arr1[], int arr2[])
    {
        int ar1 = arr1.length;
        int ar2 = arr2.length;
        List <Integer> set = new ArrayList<>();
        for (int i = 0; i < ar2; i++)
            set.add(arr2[i]);
        for (int i = 0; i < ar1; i++)
            if (!set.contains(arr1[i]))
                System.out.print(arr1[i]+" ");
    }

  public static void main(String[] args) {
        int a[] = { 1,2,3,4 };
        int b[] = { 1,3,5,10,16};
        uniqueArray(a, b);
  }
}
