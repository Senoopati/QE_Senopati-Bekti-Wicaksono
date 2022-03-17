import javax.print.DocFlavor.STRING;

public class alphabet {
    static String[][] arr = {{"","", "", "", "", ""},
    {"","A", "B", "C", "D", "E"}, 
    {"", "F", "G", "H", "I", "J"},
    {"","L", "M", "N", "O", "P"},
    {"","Q", "R", "S", "T", "U"},
    {"","V", "W", "X", "Y", "Z"},
    };

    static void getData(String inp){
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == inp) { 
                    System.out.println(i + "," + j);
                }else if (inp == "K"){
                    i=1;j=3;
                    System.out.println(i + "," + j);
                }
            }
        }
    }
    public static void main(String[] args) {
        getData("C");
    }
}
