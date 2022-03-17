
import java.util.*;

public class Problem2 {
    static void munculSama(String input){
      char[] same = input.toCharArray();
      for (int i = 0; i < input.length(); i++) {
         for (int j = i + 1; j < input.length(); j++) {
            if (same[i] == same[j]) {
               System.out.print(same[j] + " ");
               break;
            }
         }
      }
   }
    public static void main(String[] args) {
        munculSama("122333");
    }
}
