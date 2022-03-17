import java.util.ArrayList;

public class Mobil extends Hewan{
    int beratMax;
    int kapasitas;
    ArrayList<String> muatan = new ArrayList<>();

    void tambahMuatan(){
        if(beratHewan <= beratMax){
            for(int i = 1; i <= kapasitas; i++){
                 muatan.add("Hewan ke " + i);
            }
        }
    }
}
