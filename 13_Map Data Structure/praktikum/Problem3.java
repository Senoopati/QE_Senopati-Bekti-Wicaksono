public class Problem3 {
   public static void findPair(int[] input, int sum){
        for (int i = 0; i < input.length - 1; i++){
            for (int j = i + 1; j < input.length; j++){
                if (input[i] + input[j] == sum)
                {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Tidak ditemukan");
    }

    public static void main (String[] args)
    {
        int input[] = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findPair(input, sum);
    }
}
