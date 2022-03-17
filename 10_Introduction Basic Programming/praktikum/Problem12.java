public class Problem12 {
    private static float Maen(float[] numbers){
        float jumlah=0;
        int i;
        for(i=0; i < numbers.length; i++){
            jumlah = jumlah + numbers[i];
        }
        return jumlah/numbers.length;
    }
    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Maen(value));
    }
}
