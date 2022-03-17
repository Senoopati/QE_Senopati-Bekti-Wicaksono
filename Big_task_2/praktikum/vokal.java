import java.util.ArrayList;
import java.util.Random;

public class vokal {
    static int jumlahVokal = 0;
    public static void getCount(String str) {
    ArrayList<Character> vokal = new ArrayList<>();

    vokal.add('a');
    vokal.add('e');
    vokal.add('i');
    vokal.add('o');
    vokal.add('u');

    for(char s : str.toLowerCase().toCharArray()){
        if(vokal.contains(s)){
          jumlahVokal ++;
        }
      }
    }

    private static String multiply() {
        Random r = new Random();
        String character = "-.";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jumlahVokal; i++) {
            sb.append(character.charAt(r.nextInt(character.length())));
        }
        return sb.toString();
    }
  public static void main(String[] args) {
      getCount("seno");
      System.out.println(multiply());
  }
}
