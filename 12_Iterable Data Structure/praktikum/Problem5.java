import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static int findDuplicate(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
        for (int j = 0; j < arr.length; j++)
        {
            for (int k = j + 1; k < arr.length; k++) 
            {
                if (k != j && arr[k] == arr[j])
                {
                    sum = sum + arr[k];
                    list.add(sum);
                }
            }
        }
        return list.size();

	}
    public static void main(String[] args) {
        int[] in = {2,3,3,3,6,9,9};
        System.out.println(findDuplicate(in));
    }
}
