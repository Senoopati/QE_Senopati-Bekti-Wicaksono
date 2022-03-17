public class Problem2 {
    public static void main(String[] args) {
        int studentScore = 80;
        String grade;
         if ( studentScore >= 80 ) {
            grade = "A";
        } else if ( studentScore >= 65 ){
            grade = "B+";
        } else if ( studentScore >= 50 ){
            grade = "B";
        } else if ( studentScore >= 35 ){
            grade = "C+";
        } else if ( studentScore >= 49 ){
            grade = "C";
        } else if ( studentScore >= 0 ){
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);
    }
}
