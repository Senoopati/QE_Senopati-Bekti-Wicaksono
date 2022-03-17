import java.util.*;
public class Problem1{
    private static Set<String> mergeArray(String[] arr1, String[] arr2) {
    Set<String> list= new HashSet<String>(arr1.length+arr2.length);
    for (int i=0; i<arr1.length; i++) {
        list.add(arr1[i]);
    }
    for (int i=0; i<arr2.length; i++) {
        list.add(arr2[i]);
    }
    return list;

    }
    public static void main(String[] args) {
        String a[] = { "yono", "wawan", "joko" };
        String b[] = { "jamal", "wawan"};
        System.out.print(mergeArray(a,b));
    }

}